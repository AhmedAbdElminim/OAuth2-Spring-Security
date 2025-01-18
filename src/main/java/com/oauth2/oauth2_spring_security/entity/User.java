package com.oauth2.oauth2_spring_security.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class User {
    private String name;
    private String email;

}
