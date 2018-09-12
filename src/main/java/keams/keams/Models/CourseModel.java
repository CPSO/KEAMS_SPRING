package keams.keams.Models;

public class CourseModel {
    private int id, semester;
    private String nameL, nameS;

    public CourseModel(int id, String nameL, String nameS,int semester) {
        this.id = id;
        this.nameL = nameL;
        this.nameS = nameS;
        this.semester = semester;

    }

    public CourseModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getNameL() {
        return nameL;
    }

    public void setNameL(String nameL) {
        this.nameL = nameL;
    }

    public String getNameS() {
        return nameS;
    }

    public void setNameS(String nameS) {
        this.nameS = nameS;
    }
}
