package com.smartcv.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import io.hypersistence.utils.hibernate.type.json.JsonBinaryType;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "cv_analysis")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CvAnalysis {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    
    @Column(name = "cv_id", nullable = false)
    private UUID cvId;
    
    @Column(name = "full_name")
    private String fullName;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "phone", length = 50)
    private String phone;
    
    @Type(JsonBinaryType.class)
    @Column(name = "experiences", columnDefinition = "jsonb")
    private String experiences; // Stocké comme JSON string
    
    @Type(JsonBinaryType.class)
    @Column(name = "skills", columnDefinition = "jsonb")
    private String skills; // Stocké comme JSON string
    
    @Type(JsonBinaryType.class)
    @Column(name = "education", columnDefinition = "jsonb")
    private String education; // Stocké comme JSON string
    
    @Type(JsonBinaryType.class)
    @Column(name = "keywords", columnDefinition = "jsonb")
    private String keywords; // Stocké comme JSON string
    
    @Column(name = "summary", columnDefinition = "TEXT")
    private String summary;
    
    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;
    
    // Relation avec Cv
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cv_id", insertable = false, updatable = false)
    private Cv cv;
}
