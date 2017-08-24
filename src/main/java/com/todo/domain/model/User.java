package com.todo.domain.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The persistent class for the m_user database table.
 * 
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "m_user")
public class User implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @NotNull
  @Column(name = "mail_address")
  private String mailAddress;

  @NotNull
  private String password;

  @NotNull
  @Column(name = "user_name")
  private String userName;

  @OneToMany
  private List<Todo> todoList;

  public User(Integer id) {
    this.id = id;
  }

}