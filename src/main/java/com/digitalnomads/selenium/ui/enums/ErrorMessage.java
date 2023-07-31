package com.digitalnomads.selenium.ui.enums;

import lombok.Getter;

public enum ErrorMessage {
    loginValidationError("The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.");
    @Getter
    String errorMessage;

    ErrorMessage(String errorMessage){
        this.errorMessage=errorMessage;
    }
}

