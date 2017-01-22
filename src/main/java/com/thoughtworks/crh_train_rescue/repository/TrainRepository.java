    package com.thoughtworks.crh_train_rescue.repository;

    import com.thoughtworks.crh_train_rescue.entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface TrainRepository extends JpaRepository<Train, Integer> {
        Train findByName(String name);
    }
