package com.example.backend.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String username;
    private String email;
    private String imageId;
    private String backgroundImageId;
    private String GitHub;
    private String LinkedIn;
    private String Facebook;
    private String Instagram;
    private String description;
    private String interests;
    private Date date;
    private boolean restrictAvatarChanging;
    private boolean restricUsernameChanging;
    private boolean restrictPosting;
    private boolean expert;
    private boolean isStaff;

    public User() { }

    public User(String username, String email, String imageId, String backgroundImageId, String GitHub, String LinkedIn, String Facebook, String Instagram, String description, String interests) {
        this.username = username;
        this.email = email;
        this.imageId = imageId;
        this.backgroundImageId = backgroundImageId;
        this.GitHub = GitHub;
        this.LinkedIn = LinkedIn;
        this.Facebook = Facebook;
        this.Instagram = Instagram;
        this.description = description;
        this.interests = interests;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getImageId() {
        return imageId;
    }

    public String getBackgroundImageId() {
        return backgroundImageId;
    }

    public String getGitHub() {
        return GitHub;
    }

    public String getLinkedIn() {
        return LinkedIn;
    }

    public String getFacebook() {
        return Facebook;
    }

    public String getInstagram() {
        return Instagram;
    }

    public String getDescription() {
        return description;
    }

    public String getInterests() {
        return interests;
    }

    public Date getDate() {
        return date;
    }

    public boolean isRestrictAvatarChanging() {
        return restrictAvatarChanging;
    }

    public boolean isRestricUsernameChanging() {
        return restricUsernameChanging;
    }

    public boolean isRestrictPosting() {
        return restrictPosting;
    }

    public boolean isExpert() {
        return expert;
    }

    public boolean isStaff() {
        return isStaff;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public void setBackgroundImageId(String backgroundImageId) {
        this.backgroundImageId = backgroundImageId;
    }

    public void setGitHub(String gitHub) {
        GitHub = gitHub;
    }

    public void setLinkedIn(String linkedIn) {
        LinkedIn = linkedIn;
    }

    public void setFacebook(String facebook) {
        Facebook = facebook;
    }

    public void setInstagram(String instagram) {
        Instagram = instagram;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setRestrictAvatarChanging(boolean restrictAvatarChanging) {
        this.restrictAvatarChanging = restrictAvatarChanging;
    }

    public void setRestricUsernameChanging(boolean restricUsernameChanging) {
        this.restricUsernameChanging = restricUsernameChanging;
    }

    public void setRestrictPosting(boolean restrictPosting) {
        this.restrictPosting = restrictPosting;
    }

    public void setExpert(boolean expert) {
        this.expert = expert;
    }

    public void setStaff(boolean staff) {
        isStaff = staff;
    }
}