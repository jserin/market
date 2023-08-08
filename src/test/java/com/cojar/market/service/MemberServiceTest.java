package com.cojar.market.service;

import com.cojar.market.member.MemberRepository;
import com.cojar.market.member.MemberService;
import com.cojar.market.product.ProductRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberServiceTest {
    @Autowired
    private MemberService memberService;
    @Test
    @DisplayName("멤버 생성")
    void test1 () {
        String username = "test1";
        String password = "1234";
        String email = "test@test.com";
        String nickname = "tester";
        this.memberService.signup(username, password, email, nickname);

    }
}
