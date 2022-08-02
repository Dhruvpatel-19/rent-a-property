package com.example.demo.entity;



import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Entity
public class ChatRooms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int chatroomId;
    private LocalDateTime createdAt;

    @OneToMany(targetEntity = Message.class , cascade = CascadeType.ALL)
    @JoinColumn(name = "chatroom_id_fk" , referencedColumnName = "chatroomId")
    private List<Message> messageList;

    public ChatRooms() {
    }

    public ChatRooms(int chatroomId, LocalDateTime createdAt, List<Message> messageList) {
        this.chatroomId = chatroomId;
        this.createdAt = createdAt;
        this.messageList = messageList;
    }

    public int getChatroomId() {
        return chatroomId;
    }

    public void setChatroomId(int chatroomId) {
        this.chatroomId = chatroomId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }
}
