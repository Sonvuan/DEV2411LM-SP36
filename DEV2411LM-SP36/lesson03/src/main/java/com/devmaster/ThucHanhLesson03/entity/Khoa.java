package com.devmaster.ThucHanhLesson03.entity;

public class Khoa {
    Long maKh;
    String tenkh;
    public Khoa() {

    }

    public Khoa(Long maKh, String tenkh) {
        this.maKh = maKh;
        this.tenkh = tenkh;
    }

    public Long getMaKh() {
        return maKh;
    }

    public void setMaKh(Long maKh) {
        this.maKh = maKh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }
}
