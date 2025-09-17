package com.fabiooliveira.testebancoh2.entities;

import org.hibernate.annotations.IdGeneratorType;
import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_products")
public class Product {

    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)      
    private Double id;
    private String description;
    
    public Double getId() {
        return id;
    }
    public void setId(Double id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

}
