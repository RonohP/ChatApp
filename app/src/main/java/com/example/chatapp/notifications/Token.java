package com.example.chatapp.notifications;

public class Token {
    private String taken;

    public Token(String taken) {
        this.taken = taken;
    }

    public Token() {
    }

    public String getTaken() {
        return taken;
    }

    public void setTaken(String taken) {
        this.taken = taken;
    }
}
