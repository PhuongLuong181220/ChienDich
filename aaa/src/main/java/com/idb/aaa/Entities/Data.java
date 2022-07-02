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
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "app_fd_ql_data")
public class Data {
    
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "c_khachhangdata")
    private String khachHangData;

    @Column(name = "c_chiendichdata")
    private String chienDichData;
}
