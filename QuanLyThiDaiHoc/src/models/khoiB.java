package models;

public class khoiB extends In4{
    private String MATH="Math";
    private String CHEMISTRY="Chemistry";
    private String BORM="Borm";

    public khoiB(int soBaoDanh, String hoVaTen, String diaChi, int mucDoUuTien) {
        super(soBaoDanh, hoVaTen, diaChi, mucDoUuTien);
        this.MATH = MATH;
        this.CHEMISTRY = CHEMISTRY;
        this.BORM = BORM;
    }

    public String getMATH() {
        return MATH;
    }

    public void setMATH(String MATH) {
        this.MATH = MATH;
    }

    public String getCHEMISTRY() {
        return CHEMISTRY;
    }

    public void setCHEMISTRY(String CHEMISTRY) {
        this.CHEMISTRY = CHEMISTRY;
    }

    public String getBORM() {
        return BORM;
    }

    public void setBORM(String BORM) {
        this.BORM = BORM;
    }

    @Override
    public String toString() {
        return "Khối B : "+ MATH  + CHEMISTRY +BORM
                +"Mã Sinh Viên : "+this.getSoBaoDanh()+ "\n"
                +"Họ Và Tên : "+this.getHoVaTen()+ "\n"
                +"Địa Chỉ : "+this.getDiaChi()+ "\n"
                +"Mức Độ Ưu Tiên :  "+this.getMucDoUuTien();
    }
}
