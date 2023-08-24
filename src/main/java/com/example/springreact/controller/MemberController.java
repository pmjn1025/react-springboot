package com.example.springreact.controller;

import com.example.springreact.models.Member;
import com.example.springreact.service.MemberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

    @RequestMapping(value = "/api/member", method = RequestMethod.POST)
    public Member member(){
        System.out.println("controller");
        Member member = memberService.showMember();
        return member;
    }

}
