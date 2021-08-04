package com.livenow.week1.controller;

import com.livenow.week1.domain.Member;
import com.livenow.week1.domain.MemberRepository;
import com.livenow.week1.domain.Team;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MemberControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void Member_Delete() throws Exception {
        //given
        Member saveMember = Member.builder()
                .age(10)
                .name("태정")
                .team(new Team("배민")).build();
        memberRepository.save(saveMember);

        String url = "http://localhost:" + port + "/api/v1/members/" + "1L";

        //when
        ResponseEntity<Long> responseEntity = restTemplate.exchange(url, HttpMethod.DELETE, Long.class);
    }
}