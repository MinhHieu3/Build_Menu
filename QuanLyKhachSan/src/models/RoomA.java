package models;

public class RoomA extends Room{
    public RoomA() {
        super("a", 500);
    }

    @Override
    public String toString() {
        return "RoomA{}"+this.getRoomType()+this.getPrice();
    }
}
