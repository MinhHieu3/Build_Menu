package models;

public class Newspaper extends Library {
    private int ngayPhatHanh;

    public Newspaper(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int ngayPhatHanh) {
        super("Báo", maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Newspaper :  "+"\n"
                +"Mã Tài Liệu : "+this.getMaTaiLieu()+"\n"
                +"Tên Nhà Xuất Bản : "+this.getTenNhaXuatBan()+"\n"
                +"Số Bản Phát Hành : "+this.getSoPhatHanh()+"\n"
                +"Ngày Phát Hành" + ngayPhatHanh;
    }
}
