package com.jpabook.ch5.domain;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private Long id;

    private String userName;

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }
}
