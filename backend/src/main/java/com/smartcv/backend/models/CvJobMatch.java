package com.smartcv.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "cv_job_matches", 
       uniqueConstraints = @UniqueConstraint(columnNames = {"cv_id", "job_offer_id"}))
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CvJobMatch {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    
    @Column(name = "cv_id", nullable = false)
    private UUID cvId;
    
    @Column(name = "job_offer_id", nullable = false)
    private UUID jobOfferId;
    
    @Column(name = "match_score", nullable = false)
    private Integer matchScore; // 0 à 100
    
    @Column(name = "explanation", columnDefinition = "TEXT")
    private String explanation;
    
    @Column(name = "status", length = 20)
    private String status = "pending"; // pending, cv_generated, applied
    
    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;
    
    // Relations
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cv_id", insertable = false, updatable = false)
    private Cv cv;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_offer_id", insertable = false, updatable = false)
    private JobOffer jobOffer;
}