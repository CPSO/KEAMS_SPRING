package keams.keams.Models;

public class TeacherModel {
    private String name, mail,pw;
    private int id;

    public TeacherModel(String name, String mail, String pw, int id) {
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
