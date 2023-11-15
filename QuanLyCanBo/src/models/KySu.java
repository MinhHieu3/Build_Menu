package models;

public class KySu extends CanBo{
    private String nganhDaoTao;


    public KySu(String hoVaTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoVaTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "Danh Sách Kỹ Sư : "+"\n"
                +"Họ Và Tên : " + KySu.this.getHoVaTen()+"\n"
                + "Tuổi : " + KySu.this.getTuoi()+"\n"
                +"Giới Tính : " +KySu.this.getGioiTinh()+"\n"
                +"Địa Chỉ : " +KySu.this.getDiaChi()+"\n"
                +"Ngành Đào Tạo" + nganhDaoTao ;
    }
}
