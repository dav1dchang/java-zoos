package com.lambdaschool.zoos.models;

import javax.persistence.*;

@Entity
@Table(name = "animals")
public class Animals
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long animalid;

    private String animaltype;


}
