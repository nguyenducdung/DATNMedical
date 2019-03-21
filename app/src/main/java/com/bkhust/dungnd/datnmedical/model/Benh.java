package com.bkhust.dungnd.datnmedical.model;

public class Benh {
    private int maLoaiBenh;
    private String tenLoaiBenh;

    public Benh(int maLoaiBenh, String tenLoaiBenh) {
        this.maLoaiBenh = maLoaiBenh;
        this.tenLoaiBenh = tenLoaiBenh;
    }

    public int getMaLoaiBenh() {
        return maLoaiBenh;
    }

    public void setMaLoaiBenh(int maLoaiBenh) {
        this.maLoaiBenh = maLoaiBenh;
    }

    public String getTenLoaiBenh() {
        return tenLoaiBenh;
    }

    public void setTenLoaiBenh(String tenLoaiBenh) {
        this.tenLoaiBenh = tenLoaiBenh;
    }
}
