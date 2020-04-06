package com.jpabook.ch7.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ParentId implements Serializable {

    @Column(name = "PARENT_ID")
    private String id;
    @Column(name = "PARENT_ID2")
    private String id2;

    public ParentId(){};

    public ParentId(String id, String id2) {
        this.id = id;
        this.id2 = id2;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
