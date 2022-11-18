package com.activitytodo.activitytodo.services;

import com.activitytodo.activitytodo.model.Activity;
import com.activitytodo.activitytodo.repository.ActivityRepository;
import com.activitytodo.activitytodo.response.ActivityRequest;
import com.activitytodo.activitytodo.response.ActivityResponse;
import com.activitytodo.activitytodo.response.ActivityResponseOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ActivityServices {

  @Autowired
  ActivityRepository activityRepository;

  public ActivityResponseOne createActivity(ActivityRequest activityRequest) {
    Activity activity = new Activity();
    activity.setEmail(activityRequest.getEmail());
    activity.setTitle(activity.getTitle());
    activityRepository.save(activity);

    return ActivityResponseOne.builder()
        .status("Success")
        .message("Sucess")
        .data(activity)
        .build();
  }

  public ActivityResponse getAllActivity() {
    List<Activity> activity = activityRepository.findAll();
    return ActivityResponse.builder()
        .status("Success")
        .message("Sucess")
        .data(activity)
        .build();
  }

  public ActivityResponseOne getOne(Long id) {
    Activity activity = activityRepository.getActivityById(id);
    return ActivityResponseOne.builder()
        .status("Success")
        .message("Sucess")
        .data(activity)
        .build();
  }

  public ActivityResponseOne updateActivity(Long id, ActivityRequest activityRequest) {
    Activity activity = activityRepository.getActivityById(id);
    activity.setEmail(activityRequest.getEmail());
    activity.setTitle(activityRequest.getTitle());
    Activity activity1 = activityRepository.save(activity);

    return ActivityResponseOne.builder()
        .status("Success")
        .message("Sucess")
        .data(activity1)
        .build();
  }

  public ActivityResponseOne deleteActivity(Long id) {
    Activity activity = activityRepository.getActivityById(id);
    activity.getEmail();
    activity.getTitle();
    Activity activity1 = activityRepository.deleteActivityById(activity);

    return ActivityResponseOne.builder()
        .status("Success")
        .message("Sucess")
        .data(activity1)
        .build();
  }
}
