package com.jpabook.ch7.domain;

import javax.persistence.*;

@Entity
public class Child {

    @Id
    private String Id;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "PARENT_ID"),
            @JoinColumn(name = "PARENT_ID2"),
    })
    private Parent parent;
}
