package com.kowaluw.personalblog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
@AllArgsConstructor
public class Post {
    
    public int id;
    public String title;
    public String content;

}
