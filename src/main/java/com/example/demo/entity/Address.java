package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;


@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    private String streetLine;
    private String additionalStreet;
    private String city;
    private String state;
    private int postCode;
    private LocalDateTime createdAt;

    public Address() {

    }

    public Address(int addressId, String streetLine, String additionalStreet, String city, String state, int postCode, LocalDateTime createdAt) {
        this.addressId = addressId;
        this.streetLine = streetLine;
        this.additionalStreet = additionalStreet;
        this.city = city;
        this.state = state;
        this.postCode = postCode;
        this.createdAt = createdAt;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreetLine() {
        return streetLine;
    }

    public void setStreetLine(String streetLine) {
        this.streetLine = streetLine;
    }

    public String getAdditionalStreet() {
        return additionalStreet;
    }

    public void setAdditionalStreet(String additionalStreet) {
        this.additionalStreet = additionalStreet;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
