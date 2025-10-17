package com.smartcv.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "cv_versions",
       uniqueConstraints = @UniqueConstraint(columnNames = {"cv_id", "job_offer_id"}))
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CvVersion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    
    @Column(name = "cv_id", nullable = false)
    private UUID cvId;
    
    @Column(name = "job_offer_id", nullable = false)
    private UUID jobOfferId;
    
    @Column(name = "adapted_content", nullable = false, columnDefinition = "TEXT")
    private String adaptedContent;
    
    @Column(name = "pdf_url", columnDefinition = "TEXT")
    private String pdfUrl;
    
    @Column(name = "cover_letter", columnDefinition = "TEXT")
    private String coverLetter;
    
    @Column(name = "ats_score")
    private Integer atsScore; // 0 à 100
    
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