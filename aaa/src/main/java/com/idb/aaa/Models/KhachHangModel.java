package com.idb.aaa.Models;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class KhachHangModel {
    
    private String tenKH;

    private String gmailKH;

    private String sdtKH;

    private LocalDateTime ngaySinhKH;
    
}
