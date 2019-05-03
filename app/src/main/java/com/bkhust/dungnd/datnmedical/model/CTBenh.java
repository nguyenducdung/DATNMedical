package com.bkhust.dungnd.datnmedical.model;

public class CTBenh {
    private int maBenh;
    private int maLoaiBenh;
    private String tenBenh;
    private String hinhAnh;
    private String noiDung;
    private int maThuoc;

    public CTBenh(int maBenh, int maLoaiBenh, String tenBenh, String hinhAnh, String noiDung, int maThuoc) {
        this.maBenh = maBenh;
        this.maLoaiBenh = maLoaiBenh;
        this.tenBenh = tenBenh;
        this.hinhAnh = hinhAnh;
        this.noiDung = noiDung;
        this.maThuoc = maThuoc;
    }

    public CTBenh(int maBenh, String tenBenh) {
        this.maBenh = maBenh;
        this.tenBenh = tenBenh;
    }

    public int getMaBenh() {
        return maBenh;
    }

    public void setMaBenh(int maBenh) {
        this.maBenh = maBenh;
    }

    public int getMaLoaiBenh() {
        return maLoaiBenh;
    }

    public void setMaLoaiBenh(int maLoaiBenh) {
        this.maLoaiBenh = maLoaiBenh;
    }

    public String getTenBenh() {
        return tenBenh;
    }

    public void setTenBenh(String tenBenh) {
        this.tenBenh = tenBenh;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public int getMaThuoc() {
        return maThuoc;
    }

    public void setMaThuoc(int maThuoc) {
        this.maThuoc = maThuoc;
    }
}
