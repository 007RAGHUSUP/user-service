package com.userservice.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.userservice.model.UserModel;
import com.userservice.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Date;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
@WebMvcTest(UserController.class)

class UserControllerTest {


    @MockBean
    UserService userService;
    @Autowired
    MockMvc mockMvc;

    public static String asJsonString(final Object object){
        try{
            return new ObjectMapper().writeValueAsString(object);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void createPost() throws Exception {

        UserModel user= createNewPost();
        Mockito.when(userService.createPost(user)).thenReturn(user);
        mockMvc.perform(post("/users/user-new")
                        .content(asJsonString(user))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());
    }



    private UserModel createNewPost() {
        UserModel user=new UserModel();
        user.setUserId("1");
        user.setFirstName("rajesh");
        user.setMiddleName("kumar");
        user.setLastName("Menda");
        user.setDateOfBirth(new Date());
        user.setGender("male");
        user.setMartialStatus("Single");
        user.setEmployeeNumber("6965");
        user.setEmail("rajaudi1234@gmail.com");
        user.setPassword("audi@1234");
        return user;
    }
}