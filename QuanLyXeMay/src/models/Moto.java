package models;

public class Moto {
    private int id;
    private String name;
    private int price;
    private int cc;
    private int stt;
    private static int n=1;

    public Moto(int id, String name, int price, int cc) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.cc = cc;
        this.stt=n;
        n++;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Thông Tin Xe Máy Số "+this.stt +"\n"+
                "ID Xe Máy : " + id +"\n"+
                "Tên Xe : " + name + "\n"+
                "Giá Tiền : " + price +"\n"+
                "Phân Khối : " + cc+"\n" ;
    }
}
