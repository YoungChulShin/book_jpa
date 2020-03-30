package com.jpabook.ch5.service;

import com.jpabook.ch5.domain.Member;
import com.jpabook.ch5.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Service
@Transactional(readOnly = true)
public class TestService {

    @Autowired
    EntityManager em;

    @Transactional
    public void tesstSave() {

        Team team1 = new Team("team1", "팀1");
        em.persist(team1);

        Member member1 = new Member("member1", "회원1");
        member1.setTeam(team1);
        //team1.getMembers().add(member1);
        em.persist(member1);

        Member member2 = new Member("member2", "회원2");
        member2.setTeam(team1);
        //team1.getMembers().add(member2);
        em.persist(member2);

        System.out.println("member.size : " + team1.getMembers().size());
    }

    @Transactional
    public void updateTest() {

        Team team2 = new Team("team2", "팀2");
        em.persist(team2);

        Member member = em.find(Member.class, "member1");
        member.setTeam(team2);
    }

    @Transactional
    public void deleteTest() {

        Member member2 = em.find(Member.class, "member2");
        member2.setTeam(null);


        Team team1 = em.find(Team.class, "team1");

        em.remove(team1);
    }

    public void biDirection() {

        Team team = em.find(Team.class, "team1");
        var members = team.getMembers();

        for (Member member : members) {
            System.out.println("member.username = " + member.getUsername());
        }
    }

    public void teamInquiryTest() {

        Team team1 = em.find(Team.class, "team1");
        System.out.println("db member.size : " + team1.getMembers().size());
    }
}
