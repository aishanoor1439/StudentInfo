package com.mycompany.mavenproject24;

public class Student {

//    Attributes
    private String name;
    private int age;
    private String address;

//    Methods
    Student() {
        name = "Unknown";
        age = 0;
        address = "not available";
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Address:" + address);
    }

    public void setInfo(String name, int age) {
        this.name = name; 
        this.age = age;
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public void setInfo(String name, int age, String address) {
        this.name = name; 
        this.age = age;
        this.address = address;
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
    }
}
