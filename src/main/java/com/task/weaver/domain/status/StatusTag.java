package com.task.weaver.domain.status;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "STATUS_TAG")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class StatusTag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "status_tag_id", length = 100)
    private String statusTagId;

    @Column(name = "hex_code", length = 8)
    private String hexCode;
}
