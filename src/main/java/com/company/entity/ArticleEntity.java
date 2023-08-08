package com.company.entity;

import com.company.enums.ArticleStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "articles")
public class ArticleEntity extends BaseEntity {
    @Column(name = "title")
    private String title;
    @Column(columnDefinition = "text")
    private String content;
    @Column(name = "published_date")
    private LocalDateTime publishedDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private ArticleStatus status;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "moderator_id")
    private ProfileEntity moderator;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "publisher_id")
    private ProfileEntity publisher;

    @OneToMany(mappedBy = "article", fetch = FetchType.LAZY)
    private List<ArticleAttachEntity> attachList;
}
