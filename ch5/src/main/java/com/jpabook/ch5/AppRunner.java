package com.jpabook.ch5;

import com.jpabook.ch5.Service.MemberService;
import com.jpabook.ch5.Service.TeamService;
import com.jpabook.ch5.domain.Team;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;

@Component
@RequiredArgsConstructor
public class AppRunner implements ApplicationRunner {

    private final TeamService teamService;
    private final MemberService memberService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Team saveTeam = teamService.save("team1", "팀 1");


        String findId = memberService.save("member1", "멤버 끝1", saveTeam);


        System.out.println("찾기 시작");
        memberService.findOne(findId);
        System.out.println("찾기 ");
    }
}
