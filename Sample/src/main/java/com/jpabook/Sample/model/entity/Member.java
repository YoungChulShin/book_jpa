package com.jpabook.Sample.model.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    private String name;

    private String city;
    private String street;
    private String zipcode;

}
