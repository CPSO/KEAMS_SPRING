package keams.keams.Controller;

import keams.keams.Interfaces.TeacherRepositoryInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TeachersController {


    private TeacherRepositoryInterface teacherRepository = new TeacherRepository();
    /**
     * GET request for index.html.
     * This is the mapping for the front page.
     * @return mapping for index.html.
     */
    // AUTHOR(S): AP
    @RequestMapping(value = "/teachers", method = RequestMethod.GET)
    public String teachers (Model model) {
        model.addAttribute("teachers", teacherRepository.getTeacherList());

        return "/teachers";
    }
}
