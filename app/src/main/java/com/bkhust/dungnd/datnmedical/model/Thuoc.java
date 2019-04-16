package com.bkhust.dungnd.datnmedical.model;

public class Thuoc {
    private int maLoaiThuoc;
    private String tenThuoc;

    public Thuoc(int maLoaiThuoc, String tenThuoc) {
        this.maLoaiThuoc = maLoaiThuoc;
        this.tenThuoc = tenThuoc;
    }

    public int getMaLoaiThuoc() {
        return maLoaiThuoc;
    }

    public void setMaLoaiThuoc(int maLoaiThuoc) {
        this.maLoaiThuoc = maLoaiThuoc;
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }
}
