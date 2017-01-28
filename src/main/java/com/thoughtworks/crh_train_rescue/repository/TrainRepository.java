package com.thoughtworks.crh_train_rescue.repository;

import com.thoughtworks.crh_train_rescue.entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrainRepository extends JpaRepository<Train, Integer> {
    Train findByName(String name);

    Train findByIdAndDeleted(int trainId, boolean deleted);

    default Train findOne(int trainId) {
        return findByIdAndDeleted(trainId, false);
    }

    List<Train> findByDeleted(boolean deleted);

    default List<Train> findAll() {
        return findByDeleted(false);
    }
}
