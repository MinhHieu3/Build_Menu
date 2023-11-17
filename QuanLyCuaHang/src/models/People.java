package models;

public class People {
    private int id;
    private String namePeople;

    public People(int id, String namePeople) {
        this.id = id;
        this.namePeople = namePeople;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePeople() {
        return namePeople;
    }

    public void setNamePeople(String namePeople) {
        this.namePeople = namePeople;
    }
}
