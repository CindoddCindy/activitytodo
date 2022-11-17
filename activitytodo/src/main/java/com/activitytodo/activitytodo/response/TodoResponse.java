package com.activitytodo.activitytodo.response;

import com.activitytodo.activitytodo.model.Activity;
import com.activitytodo.activitytodo.model.Todo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoResponse {

  public String status;
  public String message;
  public List<Todo> data;

}
