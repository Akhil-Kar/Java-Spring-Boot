package com.firstlearning.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int a_id;
    private String a_name;
    private String tech;

    @Autowired
    private Laptop laptop;

    public Alien() {
        super();
        System.out.println("object created.");
    }

    public int getA_id() {
        return a_id;
    }
    public void setA_id(int a_id) {
        this.a_id = a_id;
    }
   
    public String getA_name() {
        return a_name;
    }
    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    public String getTech() {
        return tech;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void show() {
        System.out.println("to Show");
        laptop.compile();
    }
}
