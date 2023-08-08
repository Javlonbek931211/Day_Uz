package com.company.entity;

import com.company.enums.profile.ProfileRole;
import com.company.enums.profile.ProfileStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "profiles")
public class ProfileEntity extends BaseEntity {
    @Column(name = "name", length = 25)
    private String name;
    @Column(name = "surname", length = 25)
    private String surname;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "login", length = 20)
    private String login;
    @Column(name = "password", length = 20)
    private String password;
    @Enumerated(EnumType.STRING)
    @Column(name = "role", length = 15)
    private ProfileRole role;
    @Enumerated(EnumType.STRING)
    @Column(name = "status", length = 7)
    private ProfileStatus status;
    @Column(name = "last_active_date")
    private LocalDateTime lastActiveDate;

    @OneToMany(mappedBy = "profile", fetch = FetchType.LAZY)
    private List<LikeEntity> likes;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "attach_id")
    private AttachEntity attach;
}
