package com.jpabook.ch7.domain;

import javax.persistence.*;

@Entity
public class Parent {

    @EmbeddedId
    protected ParentId id;
}
