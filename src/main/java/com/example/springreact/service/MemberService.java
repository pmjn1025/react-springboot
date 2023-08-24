package com.example.springreact.service;

import com.example.springreact.models.Member;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    public Member showMember() {

        Member member = new Member(1,"대연쿤","동현쿤","민준쿤");

        return member;

    }
}
