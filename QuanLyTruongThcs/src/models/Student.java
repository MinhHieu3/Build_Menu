package models;

public class Student {
    private String nameStudent,homeTown;
    private int age;

    public Student(String nameStudent, String homeTown, int age) {
        this.nameStudent = nameStudent;
        this.homeTown = homeTown;
        this.age = age;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Học Sinh " +
                "Tên Học Sinh : " + nameStudent + "\n" +
                "Tuổi : " + age +"\n" +
                "Quê Quán : " + homeTown + "\n" ;
    }
}
