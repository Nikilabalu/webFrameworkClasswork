package com.example.ques2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
    @JsonProperty("student_name")
    String name;
    @JsonProperty("student_age")
    int age;
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

}
