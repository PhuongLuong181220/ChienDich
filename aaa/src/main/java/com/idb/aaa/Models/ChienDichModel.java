package com.idb.aaa.Models;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ChienDichModel {
    

    private String tenCD;

    private String loaiCD;

    private String ndCD;

    private LocalDateTime ngayBatDauCD;

    private LocalDateTime ngayKetThucCD;
}
