package com.activitytodo.activitytodo.repository;

import com.activitytodo.activitytodo.model.Activity;
import com.activitytodo.activitytodo.model.Todo;
import com.activitytodo.activitytodo.response.ActivityRequest;
import com.activitytodo.activitytodo.response.TodoRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Long> {

  Todo getTodoById(Long id);

  Todo deleteTodoById(Long todo);

}
