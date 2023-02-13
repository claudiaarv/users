package com.project.db.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Usuario implements Serializable {

    private String userName;
    private String password;
    private String name;
}
