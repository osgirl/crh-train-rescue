package com.thoughtworks.crh_train_rescue.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "train_rescue_view")
@EqualsAndHashCode
public class TrainRescue implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private Integer rescueTrainId;
    private Integer rescueTrainName;
    @Column(nullable = false)
    private Integer toRescueTrainId;
    private String toRescueTrainName;
}
