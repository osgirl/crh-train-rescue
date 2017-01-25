package com.thoughtworks.crh_train_rescue.repository;

import com.thoughtworks.crh_train_rescue.entity.TrainRescue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRescueRepository extends JpaRepository<TrainRescue, Integer> {
}
