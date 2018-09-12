package keams.keams.Interfaces;

import keams.keams.Models.StudentModel;

import java.util.List;


public interface TeacherRepositoryInterface {
    String createTeacher(StudentModel p);
    List<StudentModel> getTeacherList();

}
