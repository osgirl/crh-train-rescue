package com.thoughtworks.crh_train_rescue.service;

import com.thoughtworks.crh_train_rescue.entity.Train;
import com.thoughtworks.crh_train_rescue.repository.TrainRescueRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainResuceService {
    private TrainRescueRepository trainRescueRepository;
    private TrainBaseService trainBaseService;

    public List<Train> getRescueTrainByToRescueTrain(String toRescueTrainId) {
        return null;
    }

    public List<Train> getToResuceTrainByRescueTrain(String rescueTrain) {
        return null;
    }

    public String getRescueIdByTrains(String toRescueTrainId, String rescueTrainId) {
        return null;
    }
}
