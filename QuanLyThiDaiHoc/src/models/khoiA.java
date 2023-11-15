package models;

public class khoiA extends In4{
    private String MATH="Math";
    private String PHYSICAL="Physical";
    private String CHEMISTRY="chemistry";

    public khoiA(int soBaoDanh, String hoVaTen, String diaChi, int mucDoUuTien) {
        super(soBaoDanh, hoVaTen, diaChi, mucDoUuTien);
        this.MATH = MATH;
        this.PHYSICAL = PHYSICAL;
        this.CHEMISTRY = CHEMISTRY;
    }

    public String getMATH() {
        return MATH;
    }

    public void setMATH(String MATH) {
        this.MATH = MATH;
    }

    public String getPHYSICAL() {
        return PHYSICAL;
    }

    public void setPHYSICAL(String PHYSICAL) {
        this.PHYSICAL = PHYSICAL;
    }

    public String getCHEMISTRY() {
        return CHEMISTRY;
    }

    public void setCHEMISTRY(String CHEMISTRY) {
        this.CHEMISTRY = CHEMISTRY;
    }

    @Override
    public String toString() {
        return "Khối A : "+ MATH  + PHYSICAL + CHEMISTRY+"\n"
                +"Mã Sinh Viên : "+this.getSoBaoDanh() + "\n"
                +"Họ Và Tên : "+this.getHoVaTen()+ "\n"
                +"Địa Chỉ : "+this.getDiaChi()+ "\n"
                +"Mức Độ Ưu Tiên "+this.getMucDoUuTien();
    }
}
