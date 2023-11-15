package sevices;

import models.Information;

import java.util.ArrayList;
import java.util.List;

public class Family implements IMagager{
    private int houseNumber;
    private static int houseNumberIncrement=1;
    private int personNumber;
    private List<Information> people;

    public Family() {
      this.houseNumber = houseNumberIncrement;
      this.people = new ArrayList<>();
      houseNumberIncrement++;
      personNumber = 0;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public static int getHouseNumberIncrement() {
        return houseNumberIncrement;
    }

    public static void setHouseNumberIncrement(int houseNumberIncrement) {
        Family.houseNumberIncrement = houseNumberIncrement;
    }

    public int getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(int personNumber) {
        this.personNumber = personNumber;
    }

    public List<Information> getPeople() {
        return people;
    }

    public void setPeople(List<Information> people) {
        this.people = people;
    }

    @Override
    public void addNember(Object object) {
        for (Information p:people) {
            people.add(p);
        }
    }

    @Override
    public void deleteNember(int n) {
        for (Information p: people) {
             if (p.getCitizenCard()==n){
                people.remove(p);
            }
        }

    }

    @Override
    public Object searchNumber(int n) {
        for (Information p:people) {
            if (p.getCitizenCard()==n){
                return p;
            }
        }
        return null;
    }

    @Override
    public void showAll() {
        for (Information p:people) {
            System.out.println(p);
        }
    }

    @Override
    public String toString() {
        return "Family{" +
                "houseNumber=" + houseNumber +
                ", personNumber=" + personNumber +
                ", people=" + people +
                '}';
    }
}
