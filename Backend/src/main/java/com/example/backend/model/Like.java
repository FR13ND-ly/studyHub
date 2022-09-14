package com.example.backend.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Long userId;
    private Long topicId;
    private Long postId;
    private Long commentId;
    private boolean negative;
    private Date date;

    public Like() {
    }

    public Like(Long userId, Long topicId, Long postId, Long commentId, boolean negative) {
        this.userId = userId;
        this.topicId = topicId;
        this.postId = postId;
        this.commentId = commentId;
        this.negative = negative;
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

    public Long getPostId() {
        return postId;
    }

    public Long getCommentId() {
        return commentId;
    }

    public boolean isNegative() {
        return negative;
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

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public void setNegative(boolean negative) {
        this.negative = negative;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
