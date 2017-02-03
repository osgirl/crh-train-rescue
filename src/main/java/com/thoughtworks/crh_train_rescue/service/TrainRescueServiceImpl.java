package com.thoughtworks.crh_train_rescue.service;

import com.thoughtworks.crh_train_rescue.entity.TrainRescue;
import com.thoughtworks.crh_train_rescue.entity.TrainRescueDetail;
import com.thoughtworks.crh_train_rescue.repository.TrainRescueDetailRepository;
import com.thoughtworks.crh_train_rescue.repository.TrainRescueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TrainRescueServiceImpl implements TrainRescueService {
    private TrainRescueRepository trainRescueRepository;
    private TrainRescueDetailRepository trainRescueDetailRepository;
    // TODO: 03/02/2017 define the string in a property file
    String TO_RESCUE_TRAIN_ID = "toRescueTrainId";
    String RESCUE_TRAIN_ID = "rescueTrainId";

    @Autowired
    public TrainRescueServiceImpl(TrainRescueRepository trainRescueRepository, TrainRescueDetailRepository trainRescueDetailRepository) {
        this.trainRescueRepository = trainRescueRepository;
        this.trainRescueDetailRepository = trainRescueDetailRepository;
    }

    public TrainRescue getTrainRescueById(Integer rescueId) {
        return trainRescueRepository.findOne(rescueId);
    }

    public List<TrainRescue> getRescueByExample(TrainRescue trainRescue) {
        return trainRescueRepository.findAll(Example.of(trainRescue));
    }

    public List<TrainRescue> getRescues(Map<String, String> requestParamMap) {
        TrainRescue trainRescue = new TrainRescue();
        if (requestParamMap.containsKey(TO_RESCUE_TRAIN_ID)) {
            trainRescue.setToRescueTrainId(Integer.parseInt(requestParamMap.get(TO_RESCUE_TRAIN_ID)));
        }
        if (requestParamMap.containsKey(RESCUE_TRAIN_ID)) {
            trainRescue.setRescueTrainId(Integer.parseInt(requestParamMap.get(RESCUE_TRAIN_ID)));
        }
        return getRescueByExample(trainRescue);
    }

    @Override
    public TrainRescueDetail getRescueDetails(Map<String, String> requestParamMap) {
        assert requestParamMap.containsKey(TO_RESCUE_TRAIN_ID);
        assert requestParamMap.containsKey(RESCUE_TRAIN_ID);
        TrainRescue trainRescue = new TrainRescue();
        trainRescue.setToRescueTrainId(Integer.parseInt(requestParamMap.get(TO_RESCUE_TRAIN_ID)));
        trainRescue.setRescueTrainId(Integer.parseInt(requestParamMap.get(RESCUE_TRAIN_ID)));
        List<TrainRescue> rescueByExample = getRescueByExample(trainRescue);
        assert rescueByExample.size() == 1;
        return getRescueDetails(rescueByExample.get(0).getId());
    }

    @Override
    public TrainRescueDetail getRescueDetails(Integer rescueId) {
        return trainRescueDetailRepository.findByRescueId(rescueId);
    }
}
