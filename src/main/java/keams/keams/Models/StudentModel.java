package keams.keams.Models;

public class StudentModel {
    private String name;
    private int age, cpr;

    // AUTHOR(S): ECS
    /**
     * Constructor used to get a list of products
     * @param name The name of the product
     * @param age The price of the product
     */
    public StudentModel(String name, int age, int cpr) {
        this.cpr = cpr;
        this.name = name;
        this.age = age;

    }
    public StudentModel(){

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
