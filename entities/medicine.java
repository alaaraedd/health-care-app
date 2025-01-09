package entities;
public class medicine {
    int id;
    String name;
    double dose;
    int quentity;

    public medicine(int id, String name, double dose, int quentity) {
        this.id = id;
        this.name = name;
        this.dose = dose;
        this.quentity = quentity;
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

    public double getDose() {
        return dose;
    }

    public void setDose(double dose) {
        this.dose = dose;
    }

    public int getQuentity() {
        return quentity;
    }

    public void setQuentity(int quentity) {
        this.quentity = quentity;
    }
    
    
}
