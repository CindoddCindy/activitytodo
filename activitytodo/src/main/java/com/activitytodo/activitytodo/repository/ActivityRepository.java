package com.activitytodo.activitytodo.repository;

import com.activitytodo.activitytodo.model.Activity;
import com.activitytodo.activitytodo.response.ActivityRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityRepository extends JpaRepository<Activity,Long> {

  Activity getActivityById(Long id);

  Activity deleteActivityById(Activity activity);

}
