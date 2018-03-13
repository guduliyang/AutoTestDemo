package com.autotest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Hearder {

  @Id
  @Column(name = "id")
  private long id;
  @Column
  private long apiId;
  @Column
  private String name;
  @Column
  private String value;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getApiId() {
    return apiId;
  }

  public void setApiId(long apiId) {
    this.apiId = apiId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

}
