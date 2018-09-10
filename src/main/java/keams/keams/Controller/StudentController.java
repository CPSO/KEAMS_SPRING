package keams.keams.Controller;

import keams.keams.Interfaces.StudentRepositoryInterface;
import keams.keams.Models.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class StudentController {

    @Autowired
    private StudentRepositoryInterface studentRepository = new StudentRepository();
    /**
     * GET request for index.html.
     * This is the mapping for the front page.
     * @return mapping for index.html.
     */
    // AUTHOR(S): AP
    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public String students (Model model) {
        model.addAttribute("students", studentRepository.getStudentList());

        return "/students";
    }
}
