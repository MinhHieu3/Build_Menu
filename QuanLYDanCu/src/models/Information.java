package models;

public class Information  {
    private String namePeople;
    private int age;
    private String job;
    private int citizenCard;
    private static int cardIncrement = 1;

    public Information(String namePeople, int age, String job) {
        this.namePeople = namePeople;
        this.age = age;
        this.job = job;
        this.citizenCard = cardIncrement;
        cardIncrement++;
    }

    public String getNamePeople() {
        return namePeople;
    }

    public void setNamePeople(String namePeople) {
        this.namePeople = namePeople;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getCitizenCard() {
        return citizenCard;
    }

    public void setCitizenCard(int citizenCard) {
        this.citizenCard = citizenCard;
    }

    @Override
    public String toString() {
        return "Information{" +
                "namePeople='" + namePeople + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", citizenCard=" + citizenCard +
                '}';
    }
}
