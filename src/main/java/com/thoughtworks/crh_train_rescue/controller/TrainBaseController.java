package com.thoughtworks.crh_train_rescue.controller;

import com.thoughtworks.crh_train_rescue.entity.Train;
import com.thoughtworks.crh_train_rescue.service.TrainBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/trains")
public class TrainBaseController {
    @Autowired
    TrainBaseService trainBaseService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity findAllTrains() {
        return ResponseEntity.ok(trainBaseService.findAll());
    }


    @PutMapping()
    public Train put(Train train) {
        return trainBaseService.save(train);
    }

    @GetMapping(value = "/{trainId}")
    public ResponseEntity<Train> get(@PathVariable(value = "trainId") int id) {
        Optional<Train> trainOptional = trainBaseService.findOne(id);
        return trainOptional.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(value = "/{trainId}")
    public String remove(@PathVariable(value = "trainId") int id) {
        trainBaseService.remove(id);
        return "ok";
    }
}
