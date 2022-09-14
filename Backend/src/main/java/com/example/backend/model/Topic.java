package com.example.backend.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Long userId;
    private String name;
    private String imageId;
    private String backgroundImageId;
    private String description;
    private String tags;
    private Date date;
    private boolean restrictComments;
    private boolean restrictPosting;

    public Topic() { }

    public Topic(Long userId, String name, String imageId, String backgroundImageId, String description, String tags, boolean restrictComments) {
        this.userId = userId;
        this.name = name;
        this.imageId = imageId;
        this.backgroundImageId = backgroundImageId;
        this.description = description;
        this.tags = tags;
        this.restrictComments = restrictComments;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getImageId() {
        return imageId;
    }

    public String getBackgroundImageId() {
        return backgroundImageId;
    }

    public String getDescription() {
        return description;
    }

    public String getTags() {
        return tags;
    }

    public Date getDate() {
        return date;
    }

    public boolean isRestrictComments() {
        return restrictComments;
    }

    public boolean isRestrictPosting() {
        return restrictPosting;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public void setBackgroundImageId(String backgroundImageId) {
        this.backgroundImageId = backgroundImageId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setRestrictComments(boolean restrictComments) {
        this.restrictComments = restrictComments;
    }

    public void setRestrictPosting(boolean restrictPosting) {
        this.restrictPosting = restrictPosting;
    }
}
