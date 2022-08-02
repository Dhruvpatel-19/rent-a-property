package com.example.demo.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    private int mobileNumber;
    private String password;
    private LocalDateTime createdAt;

    @OneToMany(targetEntity = Favourites.class , cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id_fk" , referencedColumnName = "userId")
    private List<Favourites> favourites;

    @OneToMany(targetEntity = ChatRooms.class , cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id_fk" , referencedColumnName = "userId")
    private List<ChatRooms> chatRooms;

    public User() {
    }

    public User(int userId, String firstName, String lastName, String email, int mobileNumber, String password, LocalDateTime createdAt, List<Favourites> favourites, List<ChatRooms> chatRooms) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.password = password;
        this.createdAt = createdAt;
        this.favourites = favourites;
        this.chatRooms = chatRooms;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public List<Favourites> getFavourites() {
        return favourites;
    }

    public void setFavourites(List<Favourites> favourites) {
        this.favourites = favourites;
    }

    public List<ChatRooms> getChatRooms() {
        return chatRooms;
    }

    public void setChatRooms(List<ChatRooms> chatRooms) {
        this.chatRooms = chatRooms;
    }
}
