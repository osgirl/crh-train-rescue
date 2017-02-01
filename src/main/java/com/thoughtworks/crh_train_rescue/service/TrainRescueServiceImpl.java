package com.thoughtworks.crh_train_rescue.service;

import com.thoughtworks.crh_train_rescue.entity.Train;
import com.thoughtworks.crh_train_rescue.entity.TrainRescue;
import com.thoughtworks.crh_train_rescue.repository.TrainRescueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainRescueServiceImpl implements TrainRescueService{
    private TrainRescueRepository trainRescueRepository;

    @Autowired
    public TrainRescueServiceImpl(TrainRescueRepository trainRescueRepository) {
        this.trainRescueRepository = trainRescueRepository;
    }

    public TrainRescue getTrainRescueById(String rescueId) {
        return trainRescueRepository.findOne(Integer.parseInt(rescueId));
    }

    public List<Train> getRescueTrainByToRescueTrain(String toRescueTrainId) {
        return null;
    }

    public List<Train> getToRescueTrainByRescueTrain(String rescueTrain) {
        return null;
    }

    public String getRescueIdByTrains(String toRescueTrainId, String rescueTrainId) {
        return null;
    }
}
