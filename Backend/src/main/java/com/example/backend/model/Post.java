package com.example.backend.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Long userId;
    private Long topicId;
    private String title;
    private String content;
    private String files;
    private Date date;
    private boolean restrictComments;

    public Post() { }

    public Post(Long userId, Long topicId, String title, String content, String files, boolean restrictComments) {
        this.userId = userId;
        this.topicId = topicId;
        this.title = title;
        this.content = content;
        this.restrictComments = restrictComments;
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

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
    public String getFiles() {
        return files;
    }

    public Date getDate() {
        return date;
    }

    public boolean isRestrictComments() {
        return restrictComments;
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFiles(String files) {
        this.files = files;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setRestrictComments(boolean restrictComments) {
        this.restrictComments = restrictComments;
    }
}
