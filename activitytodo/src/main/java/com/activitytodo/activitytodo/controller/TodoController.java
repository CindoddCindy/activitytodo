package com.activitytodo.activitytodo.controller;

import com.activitytodo.activitytodo.model.Todo;
import com.activitytodo.activitytodo.repository.TodoRepository;
import com.activitytodo.activitytodo.response.TodoRequest;
import com.activitytodo.activitytodo.response.TodoResponse;
import com.activitytodo.activitytodo.response.TodoResponseOne;
import com.activitytodo.activitytodo.response.TodoResponseUpdate;
import com.activitytodo.activitytodo.services.TodoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class TodoController {
  @Autowired
  TodoServices todoServices;

  @PostMapping("/todo-items")
  public TodoResponseUpdate createTodoController( @RequestBody TodoRequest todoRequest) {
    return todoServices.createTodo(todoRequest);
  }

  @GetMapping("/todo-items")
  public TodoResponse getAllTodoController() {
    return todoServices.getAllTodo();
  }

  @GetMapping("/todo-items/{id}")
  public TodoResponseOne getOneController(@PathVariable("id") Long id) {
    return todoServices.getOne(id);
  }

 @PutMapping("/todo-items/{id}")
  public TodoResponseUpdate updateTodoController(@PathVariable("id") Long id, @RequestBody TodoRequest todoRequest) {
    return todoServices.updateTodo(id,todoRequest);
  }

  @DeleteMapping("/todo-items/{id}")
  public  TodoResponseUpdate deleteTodoController(@PathVariable("id") Long id) {
    return todoServices.deleteTodo(id);
  }

}
