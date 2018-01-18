package com.epam.lab.mobilepaymentsystem.model;

import javax.persistence.*;

@Entity
@Table (name = "services")
public class ServiceUnit extends AbstractEntity {

    private String name;

    private int cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
