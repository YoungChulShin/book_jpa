package com.jpabook.ch5.Repository;

import com.jpabook.ch5.domain.Team;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class TeamRepository {

    private final EntityManager em;

    public String saveOne(Team team) {

        em.persist(team);
        return  team.getId();
    }
}
