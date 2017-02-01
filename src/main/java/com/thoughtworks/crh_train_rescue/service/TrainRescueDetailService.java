package com.thoughtworks.crh_train_rescue.service;

import com.thoughtworks.crh_train_rescue.repository.TrainRescueDetailRepository;
import org.springframework.stereotype.Service;

@Service
public class TrainRescueDetailService {
    private TrainRescueDetailRepository trainRescueDetailRepository;
    private TrainRescueServiceImpl trainRescueService;
    private TrainBaseService trainBaseService;
}
