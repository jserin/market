package com.cojar.market.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberServiceTest {


    @Test
    @DisplayName("멤버 생성")
    void test1 () {
        String username = "test1";
        String password = "1234";
        String email = "test@test.com";
        String nickname = "tester";
    }
}
