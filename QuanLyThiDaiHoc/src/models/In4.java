package models;

public class In4 {
    private int soBaoDanh;
    private String hoVaTen;
    private String diaChi;
    private int mucDoUuTien;

    public In4(int soBaoDanh, String hoVaTen, String diaChi, int mucDoUuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoVaTen = hoVaTen;
        this.diaChi = diaChi;
        this.mucDoUuTien = mucDoUuTien;
    }

    public int getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(int soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getMucDoUuTien() {
        return mucDoUuTien;
    }

    public void setMucDoUuTien(int mucDoUuTien) {
        this.mucDoUuTien = mucDoUuTien;
    }
}
