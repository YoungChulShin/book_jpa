package com.jpabook.ch6.domain;

import javax.persistence.*;

@Entity
public class Member {

    @Id
    @Column(name = "MEMBER_ID")
    private String id;

    private String userName;

    @ManyToMany
    @JoinTable(name = "MEMBER_PRODUCT", joinColumns = @JoinColumn(name = "MEMBER_ID"),
        inverseJoinColumns = @JoinColumn(name = "PRODUCT_ID"));


    //== Getter, Setter
    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }
}
