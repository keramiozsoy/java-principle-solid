package com.example.solid.singleResponsibility;

class User {
    private String name;
    private Integer age;


    void updateAge(Integer age) {
        // Problem
        // The behavior of the User class only represents a single row of data in the database tables
        // You can not use updateAge method in the User class.
        // Because it adds new responsibility on User.
        // A class have only one responsibility
        // Solution
        // Move the updateAge method to another class.
    }
}
