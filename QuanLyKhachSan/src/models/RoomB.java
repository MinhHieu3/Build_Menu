package models;

public class RoomB extends Room {
    public RoomB() {
        super("B", 300);
    }

    @Override
    public String getRoomType() {
        return "RoomC{}"+this.getRoomType()+this.getPrice();
    }
}
