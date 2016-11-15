package com.bioeasy.common.model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * BaseDaoModel
 */
@MappedSuperclass
public class BaseDaoEntity extends BaseEntity {

    private static final long serialVersionUID = 5564472672113187720L;

    @Id
    @Column(length=3)
    @GeneratedValue(generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    protected int id;	//id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
