package com.bkhust.dungnd.datnmedical.model;

public class BenhVien {
    private int maBenhVien;
    private String tenBenhVien;
    private String diaChi;
    private String phone;
    private Float lat;
    private Float lng;
    private String hinhAnh;
    private String gioiThieu;

    public BenhVien(int maBenhVien, String tenBenhVien, String diaChi, String phone, Float lat, Float lng, String hinhAnh, String gioiThieu) {
        this.maBenhVien = maBenhVien;
        this.tenBenhVien = tenBenhVien;
        this.diaChi = diaChi;
        this.phone = phone;
        this.lat = lat;
        this.lng = lng;
        this.hinhAnh = hinhAnh;
        this.gioiThieu = gioiThieu;
    }

    public int getMaBenhVien() {
        return maBenhVien;
    }

    public void setMaBenhVien(int maBenhVien) {
        this.maBenhVien = maBenhVien;
    }

    public String getTenBenhVien() {
        return tenBenhVien;
    }

    public void setTenBenhVien(String tenBenhVien) {
        this.tenBenhVien = tenBenhVien;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLng() {
        return lng;
    }

    public void setLng(Float lng) {
        this.lng = lng;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getGioiThieu() {
        return gioiThieu;
    }

    public void setGioiThieu(String gioiThieu) {
        this.gioiThieu = gioiThieu;
    }
}
