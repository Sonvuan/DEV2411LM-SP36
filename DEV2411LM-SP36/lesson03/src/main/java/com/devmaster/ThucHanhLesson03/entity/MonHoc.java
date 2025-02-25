package com.devmaster.ThucHanhLesson03.entity;

public class MonHoc {
    Long mamh;
    String tenmh;
    int sotiet;

    public MonHoc(Long mamh, String tenmh, int sotiet) {
        this.mamh = mamh;
        this.tenmh = tenmh;
        this.sotiet = sotiet;
    }

    public MonHoc() {
    }

    public Long getMamh() {
        return mamh;
    }

    public void setMamh(Long mamh) {
        this.mamh = mamh;
    }

    public String getTenmh() {
        return tenmh;
    }

    public void setTenmh(String tenmh) {
        this.tenmh = tenmh;
    }

    public int getSotiet() {
        return sotiet;
    }

    public void setSotiet(int sotiet) {
        this.sotiet = sotiet;
    }
}
