package com.bkhust.dungnd.datnmedical.model;

/**
 * Created by DungND on 4/16/2019.
 */
public class MonAn {
    private int maMonAn;
    private String tenMonAn;
    private String congThucMonAn;
    private String hinhAnhMonAn;
    private String videoMonAn;
    private String congDung;

    public MonAn(int maMonAn, String tenMonAn, String congThucMonAn, String hinhAnhMonAn, String videoMonAn, String congDung) {
        this.maMonAn = maMonAn;
        this.tenMonAn = tenMonAn;
        this.congThucMonAn = congThucMonAn;
        this.hinhAnhMonAn = hinhAnhMonAn;
        this.videoMonAn = videoMonAn;
        this.congDung = congDung;
    }

    public int getMaMonAn() {
        return maMonAn;
    }

    public void setMaMonAn(int maMonAn) {
        this.maMonAn = maMonAn;
    }

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public String getCongThucMonAn() {
        return congThucMonAn;
    }

    public void setCongThucMonAn(String congThucMonAn) {
        this.congThucMonAn = congThucMonAn;
    }

    public String getHinhAnhMonAn() {
        return hinhAnhMonAn;
    }

    public void setHinhAnhMonAn(String hinhAnhMonAn) {
        this.hinhAnhMonAn = hinhAnhMonAn;
    }

    public String getVideoMonAn() {
        return videoMonAn;
    }

    public void setVideoMonAn(String videoMonAn) {
        this.videoMonAn = videoMonAn;
    }

    public String getCongDung() {
        return congDung;
    }

    public void setCongDung(String congDung) {
        this.congDung = congDung;
    }
}
