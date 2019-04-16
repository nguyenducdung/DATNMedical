package com.bkhust.dungnd.datnmedical.model;

public class CTThuoc {
    private int maThuoc;
    private int maLoaiThuoc;
    private String tenThuoc;
    private String hinhAnh;
    private String noiDung;

    public CTThuoc(int maThuoc, int maLoaiThuoc, String tenThuoc, String hinhAnh, String noiDung) {
        this.maThuoc = maThuoc;
        this.maLoaiThuoc = maLoaiThuoc;
        this.tenThuoc = tenThuoc;
        this.hinhAnh = hinhAnh;
        this.noiDung = noiDung;
    }

    public int getMaThuoc() {
        return maThuoc;
    }

    public void setMaThuoc(int maThuoc) {
        this.maThuoc = maThuoc;
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
}
