package com.thoughtworks.crh_train_rescue.service;

import com.thoughtworks.crh_train_rescue.entity.TrainRescue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TrainRescueServiceTest {
    @Autowired
    TrainRescueService trainRescueService;
    @Test
    public void shouldReturnTrainRescueGivenId () {
        TrainRescue trainRescue = trainRescueService.getTrainRescueById("1");
        assertEquals(1,trainRescue.getRescueTrainId());
        assertEquals(2,trainRescue.getToRescueTrainId());
    }
}
