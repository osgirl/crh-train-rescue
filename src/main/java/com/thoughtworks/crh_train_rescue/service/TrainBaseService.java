package com.thoughtworks.crh_train_rescue.service;

import com.thoughtworks.crh_train_rescue.entity.Train;
import com.thoughtworks.crh_train_rescue.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainBaseService {
    private TrainRepository trainRepository;

    @Autowired
    public TrainBaseService(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public Train getTrainById(String trainId) {
        return trainRepository.findOne(Integer.parseInt(trainId));
    }
}
