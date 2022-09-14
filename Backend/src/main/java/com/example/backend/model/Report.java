package com.example.backend.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Long userId;
    private Long topicId;
    private Long commentId;
    private String description;
    private Date date;

    public Report() { }

    public Report(Long userId, Long topicId, Long commentId, String description) {
        this.userId = userId;
        this.topicId = topicId;
        this.commentId = commentId;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getTopicId() {
        return topicId;
    }

    public Long getCommentId() {
        return commentId;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}