package com.knoldus.learning.java.entity;

/**
 *
 */
public class Contact {
    private String mobile;
    private String email;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact(String mobile, String email) {
        super();
        this.mobile = mobile;
        this.email = email;

    }
}
