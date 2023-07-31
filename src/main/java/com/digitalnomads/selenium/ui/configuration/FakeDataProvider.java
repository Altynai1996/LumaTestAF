package com.digitalnomads.selenium.ui.configuration;

import com.github.javafaker.Faker;

public class FakeDataProvider {
    Faker faker = new Faker();

    public String generateUserFirstName() {
        return faker.name().firstName();
    }

    public String generateUserLastName() {
        return faker.name().lastName();
    }

    public String generateUserEmail() {
        return faker.internet().emailAddress();
    }

    public String generateCompany() {
        return faker.company().name();
    }

    public String generateStreetAddress() {
        return faker.address().streetAddress();
    }

    public String generateCity() {
        return faker.address().city();
    }

    public String generateState() {
        return faker.address().state();
    }

public String generatePassword() {
        return faker.internet().password();
    }

    public String generateCountry() {
        return faker.address().country();
    }
    public String generatePhoneNumber() {
        return faker.phoneNumber().phoneNumber();
    }

        public String generatePostalCode() {
            return faker.regexify("\\d{5}-\\d{4}");
        }


    }



