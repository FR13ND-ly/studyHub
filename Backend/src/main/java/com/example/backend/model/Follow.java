package com.example.backend.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Follow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Long userId;
    private Long sharedUserId;
    private Long sharedTopicId;
    private Date date;

    public Follow() { }

    public Follow(Long userId, Long sharedUserId, Long sharedTopicId) {
        this.userId = userId;
        this.sharedUserId = sharedUserId;
        this.sharedTopicId = sharedTopicId;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getSharedUserId() {
        return sharedUserId;
    }

    public Long getSharedTopicId() {
        return sharedTopicId;
    }

    public Date getDate() {
        return date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setSharedUserId(Long sharedUserId) {
        this.sharedUserId = sharedUserId;
    }

    public void setSharedTopicId(Long sharedTopicId) {
        this.sharedTopicId = sharedTopicId;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
