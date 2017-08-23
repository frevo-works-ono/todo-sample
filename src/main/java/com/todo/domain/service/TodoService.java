package com.todo.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.todo.domain.model.Todo;
import com.todo.domain.repository.TodoRepository;

@Service
@Transactional
public class TodoService {
  @Autowired
  private TodoRepository todoRespository;

  public List<Todo> findByUserId(int userId) {
    return todoRespository.findByUserId(userId).orElse(new ArrayList<>());
  }

  public Todo save(Todo entry) {
    return todoRespository.save(entry);
  }
}
