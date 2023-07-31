package com.digitalnomads.selenium.ui.enums;

import lombok.Getter;

public enum LoginCredentials {
    altynaiUserName("Alya"),
    altynaiLastName("Tulenbaeva"),
    altynaiPassword("Altynai0708571430"),
    altynaiEmail("fought-board@u96jrbpx.mailosaur.net");



    @Getter
    String credentials;

    LoginCredentials(String credentials) {
        this.credentials = credentials;
    }
    }

