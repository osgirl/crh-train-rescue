package com.thoughtworks.crh_train_rescue.controller;

import com.thoughtworks.crh_train_rescue.entity.Train;
import com.thoughtworks.crh_train_rescue.service.TrainBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "trains")
public class TrainBaseController {
    @Autowired
    TrainBaseService trainBaseService;

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity mainPage() {
        return ResponseEntity.ok("Hello!");
    }

    @PutMapping
    public Train put(Train train) {
        return trainBaseService.save(train);
    }

    @GetMapping(value = "/{trainId}")
    public Train get(@PathVariable(value = "trainId") int id) {
        return trainBaseService.fineOne(id);
    }

    @DeleteMapping(value = "/{trainId}")
    public String remove(@PathVariable(value = "trainId") int id) {
        trainBaseService.remove(id);
        return "ok";
    }
}
