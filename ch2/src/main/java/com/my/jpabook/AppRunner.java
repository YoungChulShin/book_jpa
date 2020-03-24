package com.my.jpabook;

import com.my.jpabook.start.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.awt.*;
import java.util.List;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    EntityManager entityManager;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println(entityManager);

    }

    private void logic(EntityManager em) {
        String id = "id1";
        Member member = new Member();
        member.setId(id);
        member.setUsername("YC");
        member.setAge(37);

        // 등록
        em.persist(member);

        // 수정
        member.setAge(20);

        // 조회
        Member findMember = em.find(Member.class, id);
        System.out.println("findMember=" + findMember.getUsername() + ", " + findMember.getAge());

        // 목록 조회
        List<Member> members = em.createQuery("select m from Member m", Member.class).getResultList();
        System.out.println("members.size = " + members.size());

        // 삭제
        em.remove(member);
    }
}
