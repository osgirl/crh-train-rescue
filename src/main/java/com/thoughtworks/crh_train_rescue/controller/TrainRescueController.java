package com.thoughtworks.crh_train_rescue.controller;

import com.thoughtworks.crh_train_rescue.entity.TrainRescue;
import com.thoughtworks.crh_train_rescue.service.TrainRescueService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/rescues")
public class TrainRescueController {
    private TrainRescueService trainRescueService;

    public TrainRescueController(TrainRescueService trainRescueService) {
        this.trainRescueService = trainRescueService;
    }

    @GetMapping(value = "/{rescueId}")
    public ResponseEntity<TrainRescue> getRescueByRescueId(@PathVariable(value = "rescueId") int rescueId) {
        return ResponseEntity.ok(trainRescueService.getTrainRescueById(rescueId));
    }

    @GetMapping
    public ResponseEntity<List<TrainRescue>> getRescue(@RequestParam Map requestParamMap) {
        List<TrainRescue> rescues = trainRescueService.getRescues(requestParamMap);
        return ResponseEntity.ok(rescues);
    }
}
