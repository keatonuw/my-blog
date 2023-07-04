package com.kowaluw.personalblog.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Table(name="articlelinks", schema = "public")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ArticleLinks {
    
    @ManyToOne
    @JoinColumn(name="linkid")
    private Link link;

    @ManyToOne
    @JoinColumn(name="articleid")
    private Article article;

}
