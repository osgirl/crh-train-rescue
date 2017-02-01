package com.thoughtworks.crh_train_rescue.service;

import com.thoughtworks.crh_train_rescue.entity.Train;
import com.thoughtworks.crh_train_rescue.entity.TrainRescue;
import com.thoughtworks.crh_train_rescue.repository.TrainRescueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainRescueServiceImpl {
    private TrainRescueRepository trainRescueRepository;
    private TrainBaseService trainBaseService;

    @Autowired
    public TrainRescueServiceImpl(TrainRescueRepository trainRescueRepository, TrainBaseServiceImpl trainBaseService) {
        this.trainRescueRepository = trainRescueRepository;
        this.trainBaseService = trainBaseService;
    }

    public TrainRescue getTrainRescueById(String rescueId) {
        return trainRescueRepository.findOne(Integer.parseInt(rescueId));
    }

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
