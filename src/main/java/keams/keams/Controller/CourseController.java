package keams.keams.Controller;

import keams.keams.Interfaces.CourseRepositoryInterface;
import keams.keams.Models.Repositories.CourseRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CourseController {


    private CourseRepositoryInterface courseRepository = new CourseRepository();
    /**
     * GET request for index.html.
     * This is the mapping for the front page.
     * @return mapping for index.html.
     */
    // AUTHOR(S): AP
    @RequestMapping(value = "/courses", method = RequestMethod.GET)
    public String courses (Model model) {
        model.addAttribute("courses", courseRepository.getCourseList());

        return "/courses";
    }

    @RequestMapping(value = "/admin/courses", method = RequestMethod.GET)
    public String adminCourses (Model model) {
        model.addAttribute("courses", courseRepository.getCourseList());

        return "/admin/courses";
    }
}
