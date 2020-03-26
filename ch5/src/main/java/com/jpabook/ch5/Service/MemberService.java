package com.jpabook.ch5.Service;

import com.jpabook.ch5.Repository.MemberRepository;
import com.jpabook.ch5.domain.Member;
import com.jpabook.ch5.domain.Team;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final EntityManager entityManager;
    private final MemberRepository memberRepository;

    @Transactional
    public String save(String id, String name, Team team) {

        Member member = new Member(id, name);
        member.setTeam(team);

        String savedId = memberRepository.saveOne(member);

        System.out.println("------------------");
        memberRepository.findOne(savedId);
        System.out.println("------------------");
        memberRepository.findOne("111");
        System.out.println("------------------");


        return  savedId;
    }

    @Transactional
    public Member findOne(String id) {

        return memberRepository.findOne(id);
    }
}
