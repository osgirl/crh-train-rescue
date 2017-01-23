package com.thoughtworks.crh_train_rescue.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "train_rescue_detail")
@EqualsAndHashCode
public class TrainRescueDetail implements Serializable{
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false, unique = true)
    private int rescueId;
    @Column(length = 500)
    private String rescueText;
}
