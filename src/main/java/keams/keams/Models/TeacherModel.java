package keams.keams.Models;

public class TeacherModel {
    private String name, mail,pw;
    private int id;

    /**
     * Constructor used to get a list of products
     *
     * @param id   The name of the product
     * @param name  The price of the product
     * @param mail the number of the student
     * @param pw the name of the student
     */
    public TeacherModel(int id, String name, String mail, String pw) {
        this.name = name;
        this.mail = mail;
        this.pw = pw;
        this.id = id;
    }

    public TeacherModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
