package lab112;

public class User {
    public final static int serialVersionUID = 1;

    private int id;
    private int name;
    private int lastName;
    private double weight;

    public User(int id, int name, int lastName, double weight) {
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

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getLastName() {
        return lastName;
    }

    public void setLastName(int lastName) {
        this.lastName = lastName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void print (){
        System.out.println("helo");
    }
    @Override
    public String toString() {
        return
                "id=" + id +
                        ", name='" + name + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", weight=" + weight;
    }
}
