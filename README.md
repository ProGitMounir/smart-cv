# 🚀 Smart CV Orchestrator

Une plateforme intelligente qui analyse automatiquement les CVs, les adapte aux offres d'emploi et optimise les candidatures grâce à l'IA.

## 📋 Description

Smart CV Orchestrator permet aux candidats de :
- **Uploader leur CV** (PDF/DOCX) et extraire automatiquement les informations
- **Analyser leurs compétences** et expériences via l'IA
- **Matcher leur profil** avec des offres d'emploi pertinentes (LinkedIn, Indeed)
- **Générer des CVs adaptés** pour chaque offre avec un score de matching
- **Automatiser les candidatures** avec lettres de motivation personnalisées

## 🛠️ Stack Technique

### Backend
- **Spring Boot 3.x** - Framework Java
- **Spring AI** - Intégration LLM pour l'analyse de CV
- **Apache Tika / PDFBox** - Extraction de texte depuis PDF/DOCX
- **PostgreSQL (Supabase)** - Base de données

### Orchestration
- **n8n** - Workflow automation (fetch jobs, matching, notifications)

### Frontend
- **Lovable AI** - Génération du frontend (React/Next.js)

### Infrastructure
- **Supabase** - Database + Storage + Auth
- **Docker** - Containerisation

## 📁 Structure du Projet
smart-cv-orchestrator/
├── backend/              # Spring Boot API
│   ├── src/
│   ├── pom.xml
│   └── application.properties
├── frontend/             # Frontend (Lovable AI)
├── n8n-workflows/        # Workflows n8n (JSON exports)
├── database/             # Scripts SQL Supabase
│   └── schema.sql
└── README.md

## 🗄️ Schéma de Base de Données

- `users` - Utilisateurs et abonnements
- `cvs` - CVs uploadés
- `cv_analysis` - Données structurées extraites par IA
- `job_offers` - Offres d'emploi récupérées
- `cv_job_matches` - Résultats du matching
- `cv_versions` - CVs adaptés par offre

