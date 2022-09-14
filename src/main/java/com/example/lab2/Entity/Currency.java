package com.example.lab2.Entity;

import javax.persistence.*;

@Entity
@Table(name = "currency", schema = "lab2", catalog = "")
public class Currency {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idcurrency")
    private int idcurrency;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "network")
    private String network;
    @Basic
    @Column(name = "abbreviation")
    private String abbreviation;
    @Basic
    @Column(name = "price")
    private Double price;

    public int getIdcurrency() {
        return idcurrency;
    }

    public void setIdcurrency(int idcurrency) {
        this.idcurrency = idcurrency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


}
