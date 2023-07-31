package com.digitalnomads.selenium.ui.enums;

import lombok.Getter;

public enum ProductsForComparisonMessage {
    comparisonMessage("You added product Cobalt CoolTech™ Fitness Short to the comparison list.");

    @Getter
    String message;

    ProductsForComparisonMessage(String registrationMessage){
        this.message=registrationMessage;
    }
}


