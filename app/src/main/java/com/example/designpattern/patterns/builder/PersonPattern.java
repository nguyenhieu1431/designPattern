package com.example.designpattern.patterns.builder;

/**
 * Created by Admin on 2/9/2017.
 */

public class PersonPattern {
    public void build() {
        Person person = new Person.PersonBuilder("a", "a", "a", "asdf").setCity("xyz").build();
    }
}
