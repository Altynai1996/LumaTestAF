package com.digitalnomads.selenium.ui.models;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@ToString



public class User {
    private String firstName;
    private String lastName;
    private String userEmail;
    private String userPassword;
    private String confirmPassword;

}
