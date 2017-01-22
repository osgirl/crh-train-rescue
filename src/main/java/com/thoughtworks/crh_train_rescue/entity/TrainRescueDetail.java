package com.thoughtworks.crh_train_rescue.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "train_rescue_detail")
@EqualsAndHashCode
public class TrainRescueDetail {
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false, unique = true)
    private int rescueId;
    @Column(length = 65535)
    private String rescueText;
}
