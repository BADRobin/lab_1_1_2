package lab112;

public class User {
    private int id;
    private String name;
    private String lastName;
    private double weight;

    public User(int id, String name, String lastName, double weight) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.weight = weight;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}