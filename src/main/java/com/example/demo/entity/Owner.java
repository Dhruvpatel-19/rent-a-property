package com.example.demo.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ownerId;
    private String firstName;
    private String lastName;
    private String email;
    private int mobileNumber;
    private String password;
    private LocalDateTime createdAt;

    @OneToMany(targetEntity = Property.class , cascade = CascadeType.ALL)
    @JoinColumn(name="owner_id_fk",referencedColumnName = "ownerId")
    private List<Property> properties;

    @OneToMany(targetEntity = ChatRooms.class , cascade = CascadeType.ALL)
    @JoinColumn(name = "owner_id_fk" , referencedColumnName = "ownerId")
    private List<ChatRooms> chatRooms;

    public Owner() {
    }

    public Owner(int ownerId, String firstName, String lastName, String email, int mobileNumber, String password, LocalDateTime createdAt, List<Property> properties, List<ChatRooms> chatRooms) {
        this.ownerId = ownerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.password = password;
        this.createdAt = createdAt;
        this.properties = properties;
        this.chatRooms = chatRooms;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public List<ChatRooms> getChatRooms() {
        return chatRooms;
    }

    public void setChatRooms(List<ChatRooms> chatRooms) {
        this.chatRooms = chatRooms;
    }
}
