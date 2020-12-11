package com.lambdaschool.zoos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "zooanimals")
@IdClass(Zooanimalsid.class)
public class Zooanimals extends Auditable implements Serializable
{
    @Id
    @ManyToOne
    @JoinColumn(name = "zooid")
    @JsonIgnoreProperties(value = "animals")
    private Zoos zoos;

    @Id
    @ManyToOne
    @JoinColumn(name = "animalid")
    @JsonIgnoreProperties(value = "zoos")
    private Animals animals;

    public Zooanimals()
    {

    }

    public Zooanimals(Zoos zoos, Animals animals)
    {
        this.zoos = zoos;
        this.animals = animals;
    }

    public Zoos getZoos()
    {
        return zoos;
    }

    public void setZoos(Zoos zoos)
    {
        this.zoos = zoos;
    }

    public Animals getAnimals()
    {
        return animals;
    }

    public void setAnimals(Animals animals)
    {
        this.animals = animals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Zooanimals)) return false;

        Zooanimals that = (Zooanimals) o;

        return  ((this.zoos == null) ? 0 : this.zoos.getZooid()) ==
                ((that.getZoos() == null) ? 0 : that.getZoos().getZooid()) &&
                ((this.animals == null) ? 0 : this.animals.getAnimalid()) ==
                        ((that.getAnimals() == null) ? 0 : that.getAnimals().getAnimalid());
    }

    @Override
    public int hashCode()
    {
        return 1;
    }
}
