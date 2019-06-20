package com.wangsu.web.controller.request;

/**
 * @author linhz
 * @version 1.0 2019/6/11
 * @since 1.0
 */
public class AddPersonRequest {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
