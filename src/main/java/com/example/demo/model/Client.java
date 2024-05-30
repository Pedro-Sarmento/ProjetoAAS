package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class Client {
    private String username;
    private String password;

    public Client(String username,String password){
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }

}
