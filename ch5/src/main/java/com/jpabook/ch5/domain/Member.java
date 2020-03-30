package com.jpabook.ch5.domain;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class Member {

    @Id
    @Column(name = "MEMBER_ID")
    private String id;

    private String username;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;

    //==Constructor
    protected Member(){}

    public Member(String id, String username) {
        this.id = id;
        this.username = username;
    }

    //== Getter
    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {

        if (this.team != null) {
            this.team.getMembers().remove(this);
        }

        this.team = team;
        team.getMembers().add(this);    // member에 team을 설정할 때 team에 member를 같이 추가해준다
    }

    public void setName(String name) {
        this.username = name;
    }
}
