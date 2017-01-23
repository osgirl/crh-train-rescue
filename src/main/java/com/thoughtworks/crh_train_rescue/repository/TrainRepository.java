package com.thoughtworks.crh_train_rescue.repository;

import com.thoughtworks.crh_train_rescue.entity.Train;
import org.springframework.data.repository.CrudRepository;

public interface TrainRepository extends CrudRepository<Train, Integer> {
    Train findByName(String name);
}
