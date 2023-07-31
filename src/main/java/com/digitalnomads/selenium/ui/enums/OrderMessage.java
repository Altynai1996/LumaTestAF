package com.digitalnomads.selenium.ui.enums;

import lombok.Getter;

public enum OrderMessage {
    orderMessage("You added Bella Tank to your shopping cart.");

    @Getter
    String message;

    OrderMessage(String registrationMessage){
        this.message=registrationMessage;
    }
}


