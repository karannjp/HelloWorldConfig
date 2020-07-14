package com.karan;

import org.springframework.beans.factory.annotation.Value;

public class HelloWorld {

    private String message;
    private  Choclate choclate;
    @Value("${app.email}")
    private  String email;

    public HelloWorld(Choclate choclate){
        System.out.println("Dependency Checker");
        this.choclate=choclate;

    }

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
    public  void display(){
        choclate.display();

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
