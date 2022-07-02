package com.idb.aaa.Entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "app_fd_ql_khachhang")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class KhachHang {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "c_tenkh")
    private String tenKH;

    @Column(name = "c_gmailkh")
    private String gmailKH;

    @Column(name = "c_sdtkh")
    private String sdtKH;

    @Column(name = "c_ngaysinhkh")
    private LocalDateTime ngaySinhKH;
}
