package com.todo.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.domain.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
  public Optional<List<Todo>> findByUserId(int userId);
}
