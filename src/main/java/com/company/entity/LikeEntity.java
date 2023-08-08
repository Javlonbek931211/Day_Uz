package com.company.entity;

import com.company.enums.LikeStatus;
import com.company.enums.LikeType;
import jakarta.persistence.*;

@Entity
@Table(name = "likes")
public class LikeEntity extends BaseEntity {
    @Enumerated(EnumType.STRING)
    @Column(length = 7)
    private LikeStatus status;
    @Enumerated(EnumType.STRING)
    @Column(name = "type", length = 10)
    private LikeType type;
    @Column(name = "action_id")
    private Long actionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id")
    private ProfileEntity profile;
}
