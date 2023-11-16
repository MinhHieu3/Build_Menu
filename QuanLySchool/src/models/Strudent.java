package models;

public class Strudent {
    private int stt;
    private static int stts=1;
    private String nameStrudent;
    private int Math;
    private int Physical;
    private int Chemistry;

    public Strudent( String nameStrudent, int math, int physical, int chemistry) {
        this.stt = stts;
        this.nameStrudent = nameStrudent;
        Math = math;
        Physical = physical;
        Chemistry = chemistry;
        stts++;
    }

    public String getNameStrudent() {
        return nameStrudent;
    }

    public void setNameStrudent(String nameStrudent) {
        this.nameStrudent = nameStrudent;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getPhysical() {
        return Physical;
    }

    public void setPhysical(int physical) {
        Physical = physical;
    }

    public int getChemistry() {
        return Chemistry;
    }

    public void setChemistry(int chemistry) {
        Chemistry = chemistry;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }
    public double Medium(){
       return (double) (this.Physical + this.Chemistry + this.Math) /3;
    }

    @Override
    public String toString() {
        return "Số Thứ Tự " + stt +"\n" +
                "Họ Và Tên : " + nameStrudent + "\n" +
                "Điểm Toán " + Math+ "\n"+
                "Điểm Lý " + Physical+ "\n"+
                "Điểm Hóa " + Chemistry + "\n";
    }
}
