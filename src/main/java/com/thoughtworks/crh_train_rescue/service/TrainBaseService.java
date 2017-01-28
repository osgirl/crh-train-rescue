package com.thoughtworks.crh_train_rescue.service;

import com.thoughtworks.crh_train_rescue.entity.Train;

public interface TrainBaseService {
    Train fineOne(int trainId);
    Train save(Train train);
    void remove(int trainId);

}
