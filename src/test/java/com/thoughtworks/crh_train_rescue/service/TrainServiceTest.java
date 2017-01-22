package com.thoughtworks.crh_train_rescue.service;

import com.thoughtworks.crh_train_rescue.entity.Train;
import com.thoughtworks.crh_train_rescue.repository.TrainRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TrainServiceTest {
    @Autowired
    TrainRepository trainRepository;

    @Test
    public void shouldReturnTrainGivenId () {
        Train firstTrain = trainRepository.findOne(1);
        assertEquals("train1", firstTrain.getName());
    }
}
