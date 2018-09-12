package keams.keams.Interfaces;

import keams.keams.Models.TeacherModel;
import java.util.List;


public interface TeacherRepositoryInterface {
    //String createTeacher(TeacherModel p);
    List<TeacherModel> getTeacherList();

}
