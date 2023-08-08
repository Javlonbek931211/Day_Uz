package com.company.entity;

import com.company.enums.EmailStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "emails")
public class EmailEntity extends BaseEntity {
    @Column(name = "from_account")
    private String fromAccount;
    @Column(name = "to_account")
    private String toAccount;
    @Column(name = "used_date")
    private LocalDateTime usedDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "status", length = 7)
    private EmailStatus status;
}
