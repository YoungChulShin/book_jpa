package com.jpabook.ch5.Repository;

import com.jpabook.ch5.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final EntityManager entityManager;

    public String saveOne(Member member) {
        entityManager.persist(member);
        return  member.getId();
    }

    public Member findOne(String id) {
        return  entityManager.find(Member.class, id);
    }
}
