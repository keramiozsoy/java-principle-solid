package com.example.solid.singleResponsibility;

class User {
    private String name;
    private Integer age;


    void updateAge(Integer age) {
        // You can not use updateAge method in the User class.
        // Because it adds new responsibility on User.
        // This method changes behavior of User class.
        // The behavior of the User class only represents a single row of data in the database tables
        // One class has the responsibility to adhere to the principles of Liskov.
    }
}
