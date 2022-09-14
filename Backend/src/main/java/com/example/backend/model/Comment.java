package com.example.backend.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Long userId;
    private Long postId;
    private String content;
    private String files;
    private Date date;

    public Comment() { }

    public Comment(Long userId, Long postId, String content, String files) {
        this.userId = userId;
        this.postId = postId;
        this.content = content;
        this.files = files;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getPostId() {
        return postId;
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
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
}
