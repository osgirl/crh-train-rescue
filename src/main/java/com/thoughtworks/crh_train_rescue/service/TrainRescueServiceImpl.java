package com.thoughtworks.crh_train_rescue.service;

import com.thoughtworks.crh_train_rescue.entity.TrainRescue;
import com.thoughtworks.crh_train_rescue.repository.TrainRescueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class TrainRescueServiceImpl implements TrainRescueService {
    private TrainRescueRepository trainRescueRepository;

    @Autowired
    public TrainRescueServiceImpl(TrainRescueRepository trainRescueRepository) {
        this.trainRescueRepository = trainRescueRepository; }

    public TrainRescue getTrainRescueById(int rescueId) {
        return trainRescueRepository.findOne(rescueId);
    }

    public List<TrainRescue> getRescueByExample(TrainRescue trainRescue) {
        return trainRescueRepository.findAll(Example.of(trainRescue));
    }

    public List<TrainRescue> getRescues(Map<String, String> requestParamMap) {
        TrainRescue trainRescue = new TrainRescue();
        Integer tid = Integer.parseInt(requestParamMap.get("toRescueTrainId"));
        Integer id = Integer.parseInt(requestParamMap.get("rescueTrainId"));
        Optional<Integer> toRescueTrainId = Optional.of(tid);
        Optional<Integer> rescueTrainId = Optional.of(id);
        toRescueTrainId.ifPresent(trainRescue::setToRescueTrainId);
        rescueTrainId.ifPresent(trainRescue::setRescueTrainId);
        return getRescueByExample(trainRescue);
    }
}
