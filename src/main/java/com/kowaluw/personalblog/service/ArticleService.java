package com.kowaluw.personalblog.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kowaluw.personalblog.model.Article;
import com.kowaluw.personalblog.model.Link;
import com.kowaluw.personalblog.repository.ArticleRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    public Article getArticleById(int id) {
        return articleRepository.getReferenceById(id);
    }

    public List<Link> getLinksFor(int id) {
        List<Link> fromRepo = new LinkedList<>();
        log.info(fromRepo.toString());
        return getArticleById(id).links;
    }

}
