package com.example.glosoria.model;

public class User {

    private String username;

    private String password;

    private Deck[] decks;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
