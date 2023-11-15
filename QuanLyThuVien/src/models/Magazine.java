package models;

public class Magazine extends Library {
    private int soPhatHanh;
    private int thangPhatHanh;

    public Magazine(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super("Tạp Chí", maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    @Override
    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "Magazine : "+"\n"
                +"Mã Tài Liệu : "+this.getMaTaiLieu()
                +"Tên Nhà Xuất Bản : "+this.getTenNhaXuatBan()
                +"Số Bản Phát Hành : "+this.getSoPhatHanh()
                +"Số Phát Hành : " + soPhatHanh
                +"Tháng Phát Hành : " + thangPhatHanh ;
    }
}
