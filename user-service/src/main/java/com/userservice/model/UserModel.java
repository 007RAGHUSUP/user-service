package com.userservice.model;

import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "User")
public class UserModel {


    @Id
    private String userId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String phoneNumber;
    private Date dateOfBirth;
    private String gender;
    private String martialStatus;
    private String employeeNumber;
    private String bloodGroup;
    private String email;
    private String password;




}
