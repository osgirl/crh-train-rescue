package com.thoughtworks.crh_train_rescue.service;

import com.thoughtworks.crh_train_rescue.entity.Train;
import com.thoughtworks.crh_train_rescue.entity.TrainRescue;

import java.util.List;

public interface TrainRescueService {
    TrainRescue getTrainRescueById(String rescueId);

    List<Train> getRescueTrainByToRescueTrain(String toRescueTrainId);

    List<Train> getToRescueTrainByRescueTrain(String rescueTrain);

    String getRescueIdByTrains(String toRescueTrainId, String rescueTrainId);
}
