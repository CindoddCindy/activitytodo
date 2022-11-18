package com.activitytodo.activitytodo.services;

import com.activitytodo.activitytodo.model.Todo;
import com.activitytodo.activitytodo.repository.TodoRepository;
import com.activitytodo.activitytodo.response.TodoRequest;
import com.activitytodo.activitytodo.response.TodoResponse;
import com.activitytodo.activitytodo.response.TodoResponseOne;
import com.activitytodo.activitytodo.response.TodoResponseUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TodoServices {

  @Autowired
  TodoRepository todoRepository;

  public TodoResponseUpdate createTodo(TodoRequest todoRequest) {
    Todo todos = new Todo();
    todos.setActivity_group_id(todoRequest.getActivity_group_id());
    todos.setTitle(todoRequest.getTitle());
    todos.setIs_active(todoRequest.getIs_active());
    todos.setPriority(todoRequest.getPriority());
     todoRepository.save(todos);
    return TodoResponseUpdate.builder()
        .status("Success")
        .message("Sucess")
        .data(todos)
        .build();
  }

  public TodoResponse getAllTodo() {
    List<Todo> todos = todoRepository.findAll();
    return TodoResponse.builder()
        .status("Success")
        .message("Sucess")
        .data(todos)
        .build();
  }

  public TodoResponseOne getOne(Long id) {
    Optional<Todo> todo = todoRepository.findById(id);
    return TodoResponseOne.builder()
        .status("Success")
        .message("Sucess")
        .data(todo )
        .build();
  }

  public TodoResponseUpdate updateTodo(Long id, TodoRequest todoRequest) {
    Todo todo = todoRepository.getTodoById(id);
    todo.setActivity_group_id(todoRequest.getActivity_group_id());
    todo.setTitle(todoRequest.getTitle());
    todo.setIs_active(todoRequest.getIs_active());
    todo.setPriority(todo.getPriority());
    Todo todo1 = todoRepository.save(todo);

    return TodoResponseUpdate.builder()
        .status("Success")
        .message("Sucess")
        .data(todo1)
        .build();
  }

  public  TodoResponseUpdate deleteTodo(Long id) {
    Todo todo = todoRepository.deleteTodoById(id);
    return TodoResponseUpdate.builder()
        .status("Success")
        .message("Sucess")
        .data(todo)
        .build();
  }

}
