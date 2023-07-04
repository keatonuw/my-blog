package com.kowaluw.personalblog.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.kowaluw.personalblog.model.Article;
import com.kowaluw.personalblog.model.Link;
import com.kowaluw.personalblog.service.ArticleService;

import io.micrometer.common.lang.NonNull;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller("/")
public class PostController {

    private final ArticleService articleService;

    public Article getPost(@NonNull Integer id) {
        Article article = articleService.getArticleById(id);
        return article;
    } 

    public List<Link> getLinks(int id) {
        return articleService.getLinksFor(id);
    }

    @ModelAttribute("allArticles")
    public List<Article> allArticles() {
        return articleService.getAllArticles();
    }
   
    @GetMapping({"/", "/home"})
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }

    @GetMapping("/post/{id}")
    public String post(@PathVariable(name = "id", required = true) Integer id, Model model) {
        model.addAttribute("post", getPost(id));
        model.addAttribute("links", getLinks(id));
        return "post";
    }

}
