package com.hackathon.RewardManagement.Entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.ZonedDateTime;
import java.util.UUID;



@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "users")
@Builder
@AllArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String emailId;

    private String orderNumber;

    @Column(nullable = false)
    private UUID tenantId;

    private String siteId;

    @Column(name = "created_at", updatable = false)
    private ZonedDateTime createdAt;

    private String userName;

    private String primaryPhone;

}

