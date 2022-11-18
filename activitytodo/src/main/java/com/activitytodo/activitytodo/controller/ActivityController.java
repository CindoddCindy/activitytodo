package com.activitytodo.activitytodo.controller;

import com.activitytodo.activitytodo.model.Activity;
import com.activitytodo.activitytodo.response.ActivityRequest;
import com.activitytodo.activitytodo.response.ActivityResponse;
import com.activitytodo.activitytodo.response.ActivityResponseOne;
import com.activitytodo.activitytodo.services.ActivityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActivityController {
  @Autowired
  ActivityServices activityServices;

@PostMapping("/activity-groups")
  public ActivityResponseOne createActivityController( @RequestBody ActivityRequest activityRequest) {
    return activityServices.createActivity(activityRequest);
  }

  @GetMapping("/activity-groups")
  public ActivityResponse getAllActivityController() {
        return activityServices.getAllActivity();
  }

  @GetMapping("/activity-groups/{id}")
  public ActivityResponseOne getOneController(@PathVariable("id") Long id) {
    return activityServices.getOne(id);
  }

  @PutMapping("/activity-groups/{id}")
  public ActivityResponseOne updateActivityController(@PathVariable("id") Long id, @RequestBody ActivityRequest activityRequest) {
    return activityServices.updateActivity(id,activityRequest);
  }

  @DeleteMapping("/activity-groups/{id}")
  public ActivityResponseOne deleteActivityController(@PathVariable("id") Long id) {
    return activityServices.deleteActivity(id);
  }

}
