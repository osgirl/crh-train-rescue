package com.thoughtworks.crh_train_rescue.service;

import com.thoughtworks.crh_train_rescue.entity.Train;
import com.thoughtworks.crh_train_rescue.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class TrainBaseServiceImpl implements TrainBaseService {
    private TrainRepository trainRepository;

    @Autowired
    public TrainBaseServiceImpl(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    @Override
    @CachePut(value = "train", key = "#train.id")
    public Train save(Train train) {
        System.out.println("cached : "+ train.getId());
        return trainRepository.save(train);
    }

    @Override
    @Cacheable(value = "train", key = "#trainId")
    public Train fineOne(int trainId) {
        System.out.println("update cached : " + trainId);
        return trainRepository.findOne(trainId);
    }

    @Override
    @CacheEvict(value = "train", key = "#trainId")
    public void remove(int trainId) {
        System.out.println("remove cached : " + trainId);
        //trainRepository.delete(trainId);
    }
}
