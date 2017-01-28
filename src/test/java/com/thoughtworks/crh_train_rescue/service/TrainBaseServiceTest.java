package com.thoughtworks.crh_train_rescue.service;

import com.thoughtworks.crh_train_rescue.entity.Train;
import com.thoughtworks.crh_train_rescue.repository.TrainRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TrainBaseServiceTest {
    @Autowired
    TrainBaseService trainBaseService;
    @Autowired
    TrainRepository trainRepository;

    @Test
    public void shouldReturnTrainGivenId () {
        Optional<Train> firstTrain = trainBaseService.findOne(1);
        assertTrue(firstTrain.isPresent());
        assertEquals("train1", firstTrain.get().getName());
    }
}
