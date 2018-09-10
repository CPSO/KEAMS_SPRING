package keams.keams.Interfaces;

import keams.keams.Models.StudentModel;

import java.util.List;

public interface StudentRepositoryInterface {
    String createStudent(StudentModel p);
    List<StudentModel> getStudentList();

}
