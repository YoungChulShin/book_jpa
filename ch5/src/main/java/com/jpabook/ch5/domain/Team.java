package com.jpabook.ch5.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Entity
public class Team {

    @Id
    @Column(name = "TEAM_ID")
    private String id;

    private String name;

    //== Getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
