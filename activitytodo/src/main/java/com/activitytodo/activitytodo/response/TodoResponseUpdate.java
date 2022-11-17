package com.activitytodo.activitytodo.response;

import com.activitytodo.activitytodo.model.Todo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoResponseUpdate {

  public String status;
  public String message;
  public Todo data;

}
