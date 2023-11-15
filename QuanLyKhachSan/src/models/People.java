package models;

public class People  {
    private int id;
    private String name;
    private int age;
    private int numberRent;
    private static int myid=1;
    private Room room;

    public People(String name, int age, int numberRent, Room room) {
        this.id = myid;
        this.name = name;
        this.age = age;
        this.room = room;
        this.numberRent = numberRent;
        myid++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberRent() {
        return numberRent;
    }

    public void setNumberRent(int numberRent) {
        this.numberRent = numberRent;
    }

    public static int getMyid() {
        return myid;
    }

    public static void setMyid(int myid) {
        People.myid = myid;
    }
    public double tinhTien(){
        return numberRent * room.getPrice();
    }


    @Override
    public String toString() {
        return "Thông Tin Người Thuê :" +"\n"+
                "ID :" + id +"\n"+
                "Họ Và Tên :" + name + "\n" +
                "Tuổi :" + age +"\n"+
                "Số Ngày Thuê :" + numberRent +"\n"+
                "Loại Phòng : " + room ;
    }
}
