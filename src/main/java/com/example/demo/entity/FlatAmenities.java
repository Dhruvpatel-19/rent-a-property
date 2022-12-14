package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;


@Entity
public class FlatAmenities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int flatId;
    private String name;
    private LocalDateTime createdAt;

    public FlatAmenities() {
    }

    public FlatAmenities(int flatId, String name, LocalDateTime createdAt) {
        this.flatId = flatId;
        this.name = name;
        this.createdAt = createdAt;
    }

    public int getFlatId() {
        return flatId;
    }

    public void setFlatId(int flatId) {
        this.flatId = flatId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
