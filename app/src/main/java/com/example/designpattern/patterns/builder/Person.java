package com.example.designpattern.patterns.builder;

import java.lang.reflect.Field;

/**
 * Created by Admin on 2/9/2017.
 */

public class Person {
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final String salutation;
    private final String suffix;
    private final String streetAddress;
    private final String city;
    private final String state;
    private final boolean isFemale;
    private final boolean isEmployed;
    private final boolean isHomewOwner;

    public Person(String lastName, String firstName, String middleName, String salutation, String suffix, String streetAddress, String city, String state, boolean isFemale, boolean isEmployed, boolean isHomewOwner) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.salutation = salutation;
        this.suffix = suffix;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.isFemale = isFemale;
        this.isEmployed = isEmployed;
        this.isHomewOwner = isHomewOwner;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSalutation() {
        return salutation;
    }

    public String getSuffix() {
        return suffix;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public boolean isHomewOwner() {
        return isHomewOwner;
    }

    public static class PersonBuilder {
        private String lastName;
        private String firstName;
        private String middleName;
        private String salutation;
        private String suffix;
        private String streetAddress;
        private String city;
        private String state;
        private boolean isFemale;
        private boolean isEmployed;
        private boolean isHomewOwner;

        public PersonBuilder(String lastName, String firstName, String middleName, String streetAddress) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.middleName = middleName;
            this.streetAddress = streetAddress;
        }


        public PersonBuilder setSalutation(String salutation) {
            this.salutation = salutation;
            return this;
        }

        public PersonBuilder setSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }

        public PersonBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public PersonBuilder setState(String state) {
            this.state = state;
            return this;
        }

        public PersonBuilder setFemale(boolean female) {
            isFemale = female;
            return this;
        }

        public PersonBuilder setEmployed(boolean employed) {
            isEmployed = employed;
            return this;
        }

        public PersonBuilder setHomewOwner(boolean homewOwner) {
            isHomewOwner = homewOwner;
            return this;
        }

        public Person build() {
            return new Person(lastName, firstName, middleName, salutation, suffix, streetAddress, city, state, isFemale, isEmployed, isHomewOwner);
        }
    }
}
