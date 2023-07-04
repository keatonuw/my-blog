package com.kowaluw.personalblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kowaluw.personalblog.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
    
} 