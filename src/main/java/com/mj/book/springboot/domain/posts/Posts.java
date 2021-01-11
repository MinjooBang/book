package com.mj.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
/*
DB의 테이블과 매칭될 클래스
@Entity 테이블과 링크될 클래스
@Id pk 필드
@GeneratedValue pk 생성 규칙
@Column 테이블의 칼럼

setter 메소드가 없다
Entity 클래스는 setter 만들지 않느다.
 */

@Getter
@NoArgsConstructor
@Entity
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 500, nullable = false)
    private String title;
    @Column(columnDefinition = "TEXT" ,nullable = false)
    private String content;

    private String author;
    @Builder
    public Posts(String title,String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
