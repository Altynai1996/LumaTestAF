package com.digitalnomads.selenium.ui.enums;

import lombok.Getter;

public enum RegistrationMessage {

    registrationMessage("Thank you for registering with Main Website Store.");

    @Getter
   String registration;

    RegistrationMessage(String registrationMessage){
        this.registration=registrationMessage;
    }
    }
