package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;


@Entity
public class SocietyAmenities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int societyId;
    private String name;
    private LocalDateTime createdAt;

    public SocietyAmenities() {
    }

    public SocietyAmenities(int societyId, String name, LocalDateTime createdAt) {
        this.societyId = societyId;
        this.name = name;
        this.createdAt = createdAt;
    }

    public int getSocietyId() {
        return societyId;
    }

    public void setSocietyId(int societyId) {
        this.societyId = societyId;
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
