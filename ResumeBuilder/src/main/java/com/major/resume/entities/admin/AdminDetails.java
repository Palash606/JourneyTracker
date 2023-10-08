package com.major.resume.entities.admin;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdminDetails {
    @Id
    private Integer id;
    private String adminUsername;
    private String adminPassword;

    public AdminDetails(Integer id, String adminUsername, String adminPassword) {
        this.id = id;
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
    }

    public AdminDetails() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
}
