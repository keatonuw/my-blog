package com.kowaluw.personalblog.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="links", schema = "public")
@AllArgsConstructor
@NoArgsConstructor
public class Link {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="linkid")
    public int id;

    @Column(name="link")
    public String url;

    @Column(name="name")
    public String text;
}
