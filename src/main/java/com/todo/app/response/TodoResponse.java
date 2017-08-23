package com.todo.app.response;

import com.todo.domain.model.Todo;

import lombok.Data;

@Data
public class TodoResponse {
  private int id;
  private String content;
  private String status;
  private String limitDate;
  private String priority;

  public TodoResponse(Todo entity) {

    this.id = entity.getId();
    this.content = entity.getContent();
    this.status = "";
    this.limitDate = "";
    this.priority = "";
  }
}
