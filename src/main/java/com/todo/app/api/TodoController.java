package com.todo.app.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.todo.app.response.TodoResponse;
import com.todo.domain.dto.LoginUser;
import com.todo.domain.model.Todo;
import com.todo.domain.service.TodoService;

@RestController
@RequestMapping("api/todo")
public class TodoController {
  @Autowired
  TodoService todoService;

  @RequestMapping(method = RequestMethod.GET)
  public List<TodoResponse> get(@AuthenticationPrincipal LoginUser loginUser) {
    List<TodoResponse> response = new ArrayList<>();

    List<Todo> todoList = todoService.findByUserId(loginUser.getUserId());

    todoList.stream().forEach(todo -> response.add(new TodoResponse(todo)));

    return response;
  }

  @RequestMapping(method = RequestMethod.POST)
  @ResponseStatus(HttpStatus.CREATED)
  public TodoResponse post(@Validated @RequestBody Todo request) {

    Todo todo = todoService.save(request);

    return new TodoResponse(todo);
  }
}
