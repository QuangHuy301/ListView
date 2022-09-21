package com.example.taolist;

public class MonAn {
    private String Ten;
    private String MoTa;
    private int Hinh;
    private String Gia;
    private int Cong;
    private int Tru;

    public MonAn(String ten, String moTa, int hinh,String gia, int cong, int tru) {
        Ten = ten;
        MoTa = moTa;
        Hinh = hinh;
        Gia = gia;
        Cong = cong;
        Tru = tru;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String gia) {
        Gia = gia;
    }

    public int getCong() {
        return Cong;
    }

    public void setCong(int cong) {
        Cong = cong;
    }

    public int getTru() {
        return Tru;
    }

    public void setTru(int tru) {
        Tru = tru;
    }
}
