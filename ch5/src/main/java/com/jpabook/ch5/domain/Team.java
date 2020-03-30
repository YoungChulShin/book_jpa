package com.jpabook.ch5.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
public class Team {

    @Id
    @Column(name = "TEAM_ID")
    private String id;

    private String name;

    @OneToMany(mappedBy = "team")
    private List<Member> members = new ArrayList<>();

    //== Constructor
    protected Team(){}

    public Team(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //== Getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
