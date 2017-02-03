package com.thoughtworks.crh_train_rescue.service;

import com.thoughtworks.crh_train_rescue.entity.TrainRescue;
import com.thoughtworks.crh_train_rescue.entity.TrainRescueDetail;

import java.util.List;
import java.util.Map;

public interface TrainRescueService {
    TrainRescue getTrainRescueById(Integer rescueId);

    List<TrainRescue> getRescueByExample(TrainRescue trainRescue);

    List<TrainRescue> getRescues(Map<String, String> requestParamMap);

    TrainRescueDetail getRescueDetails(Map<String, String> requestParamMap);

    TrainRescueDetail getRescueDetails(Integer rescueId);
}
