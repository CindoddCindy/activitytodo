package com.activitytodo.activitytodo.response;

import com.activitytodo.activitytodo.model.Activity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityResponse {
  public String status;
  public String message;
  public List<Activity> data;
}
