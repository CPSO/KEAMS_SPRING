package keams.keams.Interfaces;

import keams.keams.Models.CourseModel;
import java.util.List;


public interface CourseRepositoryInterface {
    //String createCourse(CourseModel p);
    List<CourseModel> getCourseList();

}
