package com.example.springreact.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
public class Member {

    private int id;
    private String userName;
    private String passWord;
    private String email;

    public Member(int id, String userName, String passWord, String email){
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
    }

}
