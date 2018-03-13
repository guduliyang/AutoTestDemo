package com.autotest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Project {
    @Id
    @Column(name = "id")
    private long id;
    @Column
    private String name;
    @Column
    private String nickname;
    @Column
    private String manager;
    @Column
    private long status;
    @Column
    private java.sql.Timestamp creatTime;
    @Column
    private java.sql.Timestamp updataTime;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }


    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }


    public java.sql.Timestamp getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(java.sql.Timestamp creatTime) {
        this.creatTime = creatTime;
    }


    public java.sql.Timestamp getUpdataTime() {
        return updataTime;
    }

    public void setUpdataTime(java.sql.Timestamp updataTime) {
        this.updataTime = updataTime;
    }

}
