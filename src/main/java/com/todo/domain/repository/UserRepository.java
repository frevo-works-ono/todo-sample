package com.todo.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.domain.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
  public Optional<User> findByMailAddress(String mailAddress);
}
