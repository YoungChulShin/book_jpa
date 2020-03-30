package com.jpabook.ch5.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

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

<<<<<<< HEAD
    //==Constructor
=======
>>>>>>> af29c3b7b0a778e2f129022208e26f994709a244
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
<<<<<<< HEAD

        if (this.team != null) {
            this.team.getMembers().remove(this);
        }

        this.team = team;
        team.getMembers().add(this);    // member에 team을 설정할 때 team에 member를 같이 추가해준다
    }

    public void setName(String name) {
        this.username = name;
=======
        this.team = team;
>>>>>>> af29c3b7b0a778e2f129022208e26f994709a244
    }
}
