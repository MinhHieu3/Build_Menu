package models;

public class Book extends Library{
    private String tenTacGia;
    private int soTrang;

    public Book( String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super("Book", maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }
    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Book:"+"\n"
                +"Mã Tài Liệu : "+this.getMaTaiLieu()+"\n"
                +"Tên Nhà Xuất Bản : "+this.getTenNhaXuatBan()+"\n"
                +"Số Bản Phát Hành : "+this.getSoPhatHanh()+"\n"
                +"Tên Tác Giả : " + tenTacGia+"\n"
                +"Số Trang : " + soTrang ;
    }


}
