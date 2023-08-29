package com.kamar.spring_a_blog.app.business;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * user class.
 * @author kamar baraka.*/

@Getter
@Setter
@ToString
public class User {

    private String guid;
    private String userId;
    private String name;
    private String password;
    private String password2;

}
