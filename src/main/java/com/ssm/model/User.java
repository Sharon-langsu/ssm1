package com.ssm.model;

import lombok.Data;

@Data
public class User {
    private long id;
    private String email;
    private String mobile;
    private String username;
    private String role;
}
