package com.betterjavacode.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name="Company")
@Table(name="company")
public class Company implements Serializable
{
    public Company()
    {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable=false)
    private String name;
    @Column(nullable=false)
    private String type;

    public Company(int id, String name, String type)
    {
        this.id = id;
        this.type = type;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }
}
