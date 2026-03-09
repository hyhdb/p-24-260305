package com.back.domain.post.entity;

import com.back.global.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Post extends BaseEntity {

    private String title;
    private String content;

    public void update(String title, String content) {
        //post 수정 로직1
        //post 수정 로직2
        //post 수정 로직3
        this.title = title;
        this.content = content;
    }
}