package ru.gadjik.springpeople.models;

import javax.validation.constraints.*;


/**
 * @author Gadjikr
 */

public class Person {
    private int id;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2,max = 15, message = "Size should be between 2 and 15 characters")
    private String name;

    @Min(value = 12 , message = "Age should be greater than 12")
    private int age;

    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Email should be valid")
    private String email;



    @Pattern(regexp = "[A-Z]\\w+, [A-Z]\\w+, \\d{6}", message = "Country, City, ZIP CODE (6 digits)")
    private String address;

    public Person(){

    }

    public Person(int id, String name, int age, String email, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email=email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

        public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
