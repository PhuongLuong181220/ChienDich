package com.idb.aaa.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "app_fd_ql_chiendich")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChienDich {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "c_tencd")
    private String tenCd;

    @Column(name = "C_loaicd")
    private String loaiCd;

    @Column(name = "c_ngaybatdaucd")
    private String ngayBatDau;

    @Column(name = "c_ngayketthuccd")
    private String ngayKetThuc;

    @Column(name = "c_ndcd")
    private String noiDung;
}
