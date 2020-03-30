package com.jpabook.ch5.domain;

import lombok.Getter;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TEAM_ID")
    private Long id;

    private String name;

    @OneToMany
    @JoinColumn(name = "TEAM_ID")
    private List<Member> members = new ArrayList<>();

    //== Constructor
    protected Team(){}

    //== Getter
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
