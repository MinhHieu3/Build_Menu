package models;

public class Teacher {
    private int ID;
    private String nameTeacher;
    private String subject;
    private double wega;
    private static int id=1;

    public Teacher( String nameTeacher, String subject, double wega) {
        this.ID = id;
        this.nameTeacher = nameTeacher;
        this.subject = subject;
        this.wega = wega;
        id++;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getWega() {
        return wega;
    }

    public void setWega(double wega) {
        this.wega = wega;
    }

    @Override
    public String toString() {
        return
                "Số Thứ Tự Giáo Viên" + ID +"\n" +
                "Tên Giáo Viên : " + nameTeacher + "\n" +
                "Môn Dạy : " + subject + "\n" +
                "Lương : " + wega +"\n" ;
    }
}
