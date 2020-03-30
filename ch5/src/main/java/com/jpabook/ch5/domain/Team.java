package com.jpabook.ch5.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
=======
import javax.persistence.Temporal;
>>>>>>> af29c3b7b0a778e2f129022208e26f994709a244

@Getter
@Entity
public class Team {

    @Id
    @Column(name = "TEAM_ID")
    private String id;

    private String name;

<<<<<<< HEAD
    @OneToMany(mappedBy = "team")
    private List<Member> members = new ArrayList<>();

    //== Constructor
=======
>>>>>>> af29c3b7b0a778e2f129022208e26f994709a244
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

    public void setName(String name) {
        this.name = name;
    }
}
