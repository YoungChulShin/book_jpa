package com.jpabook.ch5.Service;

import com.jpabook.ch5.Repository.TeamRepository;
import com.jpabook.ch5.domain.Team;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository;

    @Transactional
    public Team save(String id, String name) {

        Team team = new Team(id, name);
        teamRepository.saveOne(team);

        return  team;
    }
}
