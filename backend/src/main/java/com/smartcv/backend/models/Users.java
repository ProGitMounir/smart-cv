package com.smartcv.backend.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "users") // important car ta table s'appelle "users" (en minuscule)
public class Users {

    @Id
    private UUID id;

    private String first_name;
    private String last_name;
    private String email;
    private String password_hash;
    private String subscription_plan;
    private int cvs_generated_this_month;

    private LocalDateTime subscription_start_date;
    private LocalDateTime subscription_end_date;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    // --- Constructeurs ---
    public Users() {}

    // --- Getters et Setters ---
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public String getSubscription_plan() {
        return subscription_plan;
    }

    public void setSubscription_plan(String subscription_plan) {
        this.subscription_plan = subscription_plan;
    }

    public int getCvs_generated_this_month() {
        return cvs_generated_this_month;
    }

    public void setCvs_generated_this_month(int cvs_generated_this_month) {
        this.cvs_generated_this_month = cvs_generated_this_month;
    }

    public LocalDateTime getSubscription_start_date() {
        return subscription_start_date;
    }

    public void setSubscription_start_date(LocalDateTime subscription_start_date) {
        this.subscription_start_date = subscription_start_date;
    }

    public LocalDateTime getSubscription_end_date() {
        return subscription_end_date;
    }

    public void setSubscription_end_date(LocalDateTime subscription_end_date) {
        this.subscription_end_date = subscription_end_date;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }
}
