package com.rutas.route.domain.model;

public class User {
    private Long userId;
    private String email;

    public User() {
    }

    public User(Long userId, String email) {
        this.userId = userId;
        this.email = email;
    }
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
