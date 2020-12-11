package com.lambdaschool.zoos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "zoos")
public class Zoos
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zooid;

    private String zooname;

    @OneToMany(mappedBy = "zoo",
        cascade = CascadeType.ALL,
        orphanRemoval = true)
    @JsonIgnoreProperties(value = "zoo")
    private List<Telephones> telephones = new ArrayList<>();

    @OneToMany(mappedBy = "zoo",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JsonIgnoreProperties(value = "zoo", allowSetters = true)
    private Set<Zooanimals> zooanimals = new HashSet<>();

    public Zoos()
    {

    }

    public Zoos(String zooname, List<Telephones> telephones, Set<Zooanimals> zooanimals)
    {
        this.zooname = zooname;
        this.telephones = telephones;
        this.zooanimals = zooanimals;
    }

    public long getZooid()
    {
        return zooid;
    }

    public void setZooid(long zooid)
    {
        this.zooid = zooid;
    }

    public String getZooname()
    {
        return zooname;
    }

    public void setZooname(String zooname)
    {
        this.zooname = zooname;
    }

    public List<Telephones> getTelephones()
    {
        return telephones;
    }

    public void setTelephones(List<Telephones> telephones)
    {
        this.telephones = telephones;
    }

    public Set<Zooanimals> getZooanimals()
    {
        return zooanimals;
    }

    public void setZooanimals(Set<Zooanimals> zooanimals)
    {
        this.zooanimals = zooanimals;
    }
}
