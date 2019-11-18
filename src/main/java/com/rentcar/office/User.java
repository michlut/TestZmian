package com.rentcar.office;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    private String name;
    private String surnname;

    public User(@Value("${name}") String name, @Value("${sourname}") String surnname) {
        this.name = name;
        this.surnname = surnname;
    }


    void showInfo(){
        System.out.println("Hello");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surnname='" + surnname + '\'' +
                '}';
    }
}
