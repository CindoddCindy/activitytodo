package com.activitytodo.activitytodo.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoRequest {

  private String activity_group_id;
  private String title;
  private String is_active;
  private String priority;

}
