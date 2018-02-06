package com.zz.newbuy.modules.security.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * This class domain class for login request.
 * Created by vishal.domale
 * @version 0.0.1
 */
public class LoginRequest {

    // This field will map with login request json's username key.
    private String username;
    // This field will  map with login request json's password key.
    private String password;

    
    @JsonCreator
    public LoginRequest(@JsonProperty("username") String username, @JsonProperty("password") String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Return username from the loginRequest
     * @return username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Return Password from the loginRequest
     * @return
     */
    public String getPassword() {
        return password;
    }
    
    
}