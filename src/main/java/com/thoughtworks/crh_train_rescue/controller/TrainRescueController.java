package com.thoughtworks.crh_train_rescue.controller;

import com.thoughtworks.crh_train_rescue.entity.TrainRescue;
import com.thoughtworks.crh_train_rescue.service.TrainRescueService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainRescueController {
    private TrainRescueService trainRescueService;

    public TrainRescueController(TrainRescueService trainRescueService) {
        this.trainRescueService = trainRescueService;
    }

    public ResponseEntity<TrainRescue> getTrainRescueByRescueId() {

        return null;
    }
}
