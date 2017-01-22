package com.thoughtworks.crh_train_rescue.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
@EqualsAndHashCode
public class TrainResuce {
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private int rescueTrainId;
    @Column(nullable = false)
    private int toRescueTrainId;
}
