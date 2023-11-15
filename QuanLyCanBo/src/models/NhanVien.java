package models;

public class NhanVien extends CanBo {
    private String congViec;

    public NhanVien(String hoVaTen, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(hoVaTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "Nhân Viên"+"\n"
                +"Họ Và Tên : " + NhanVien.this.getHoVaTen()+"\n"
                +"Tuổi : " + NhanVien.this.getTuoi()+"\n"
                +"Giới Tính : "  +NhanVien.this.getGioiTinh()+"\n"
                +"Địa Chỉ : " +NhanVien.this.getDiaChi()+"\n"
                +"Công Việc : " + congViec ;
    }
}
