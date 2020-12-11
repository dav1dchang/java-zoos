package com.lambdaschool.zoos.models;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Zooanimalsid implements Serializable
{
    private long zoo;
    private long animal;

    public Zooanimalsid()
    {

    }

    public long getZoo()
    {
        return zoo;
    }

    public void setZoo(long zoo)
    {
        this.zoo = zoo;
    }

    public long getAnimal()
    {
        return animal;
    }

    public void setAnimal(long animal)
    {
        this.animal = animal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zooanimalsid that = (Zooanimalsid) o;
        return getZoo() == that.getZoo() &&
                getAnimal() == that.getAnimal();
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
