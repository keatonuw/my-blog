package com.kowaluw.personalblog.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="articles", schema = "public")
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    
    public String title;
    public String subtitle;
    public String posted;
    public String summary;
    public String contents;

    @ManyToMany
    @JoinTable(
        name = "articlelinks",
        joinColumns = @JoinColumn(name = "articleid"),
        inverseJoinColumns = @JoinColumn(name = "linkid")
    )
    public List<Link> links;

}
