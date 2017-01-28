package com.thoughtworks.crh_train_rescue.service;

import com.thoughtworks.crh_train_rescue.entity.Train;

import java.util.List;
import java.util.Optional;

public interface TrainBaseService {
    Optional<Train> findOne(int trainId);
    Train save(Train train);
    void remove(int trainId);
    List<Train> findAll();
    Train update(Train train, int trainId);
}
