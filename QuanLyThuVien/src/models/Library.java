package models;

public class Library {
    private String loaiTaiLieu;
    private String maTaiLieu;
    private String tenNhaXuatBan;
    private int soPhatHanh;

    public Library(String loaiTaiLieu, String maTaiLieu, String tenNhaXuatBan, int soPhatHanh) {
        this.loaiTaiLieu = loaiTaiLieu;
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soPhatHanh = soPhatHanh;
    }
    public String getLoaiTaiLieu() {
        return loaiTaiLieu;
    }

    public void setLoaiTaiLieu(String loaiTaiLieu) {
        this.loaiTaiLieu = loaiTaiLieu;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }
}
