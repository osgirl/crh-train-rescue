package com.thoughtworks.crh_train_rescue.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "train")
@EqualsAndHashCode(exclude = "type")
public class Train implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String name;
    private String type;
    private boolean deleted;
}
