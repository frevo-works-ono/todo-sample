package com.todo.domain.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "t_todo")
public class Todo implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @NotNull
  private String content;

  @NotNull
  private String status;

  @Column(name = "limit_date")
  private Date limitDate;

  @NotNull
  private int priority;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

}