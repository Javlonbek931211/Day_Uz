package com.company.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "attach")
public class AttachEntity extends BaseEntity {
    @Column(name = "key", length = 40)
    private String key;
    @Column(name = "original_name")
    private String originalName;
    @Column(name = "file_path", length = 20)
    private String filePath;
    @Column(name = "extension", length = 20)
    private String extension;
    @Column(name = "size")
    private Long size;

    @OneToMany(mappedBy = "attach", fetch = FetchType.LAZY)
    private List<ArticleAttachEntity> articleList;
}
