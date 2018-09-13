package keams.keams.Interfaces;

import keams.keams.Models.StudentModel;
import java.util.List;


public interface StudentRepositoryInterface {
    String createStudent(StudentModel p);
    void updateStudent(StudentModel p);
    List<StudentModel> getStudentList();
    StudentModel get(String id);

}
