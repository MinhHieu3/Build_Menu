package models;

public class khoiC extends In4{
    private String LITERATURE ="Literature";
    private String HISTORY="History";
    private String LAND="Land";

    public String getLITERATURE() {
        return LITERATURE;
    }

    public void setLITERATURE(String LITERATURE) {
        this.LITERATURE = LITERATURE;
    }

    public String getHISTORY() {
        return HISTORY;
    }

    public void setHISTORY(String HISTORY) {
        this.HISTORY = HISTORY;
    }

    public String getLAND() {
        return LAND;
    }

    public void setLAND(String LAND) {
        this.LAND = LAND;
    }

    public khoiC(int soBaoDanh, String hoVaTen, String diaChi, int mucDoUuTien) {
        super(soBaoDanh, hoVaTen, diaChi, mucDoUuTien);
        this.LITERATURE = LITERATURE;
        this.HISTORY = HISTORY;
        this.LAND = LAND;

    }

    @Override
    public String toString() {
        return "Khối C : "+ LITERATURE  + HISTORY +LAND+"\n"
                +"Mã Sinh Viên : "+this.getSoBaoDanh()+ "\n"
                +"Họ Và Tên : "+this.getHoVaTen()+ "\n"
                +"Địa Chỉ : "+this.getDiaChi()+ "\n"
                +"Mức Độ Ưu Tiên :  "+this.getMucDoUuTien();

    }
}
