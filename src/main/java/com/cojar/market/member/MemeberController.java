package com.cojar.market.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/member")
@Controller
public class MemeberController {
    @GetMapping("/login")
    public String login(){
        return "member/login";
    }

    @GetMapping("/signup")
    public String signup(){
        return "member/signup";
    }
}
