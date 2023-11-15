package models;

public class RoomC extends Room{
    public RoomC() {
        super("C", 100);
    }

    @Override
    public String getRoomType() {
        return "RoomC{}"+this.getRoomType()+this.getPrice();
    }
}
