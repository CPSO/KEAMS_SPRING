package keams.keams.Models;

public class StudentModel {
    private String name;
    private int id, age, cpr;

    // AUTHOR(S): ECS
    /**
     * Constructor used to get a list of products
     * @param id The name of the product
     * @param age The price of the product
     * @param cpr the number of the student
     * @param name the name of the student
     */
    public StudentModel(int id, int cpr, String name, int age) {
        this.id = id;
        this.cpr = cpr;
        this.name = name;
        this.age = age;

    }
    public StudentModel(){

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCpr() {
        return cpr;
    }

    public void setCpr(int cpr) {
        this.cpr = cpr;
    }
}
