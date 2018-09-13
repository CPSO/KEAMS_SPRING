package keams.keams.Controller;

import keams.keams.Interfaces.StudentRepositoryInterface;
import keams.keams.Models.Repositories.StudentRepository;
import keams.keams.Models.StudentModel;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {


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

    @RequestMapping(value = "/admin/students", method = RequestMethod.GET)
    public String adminStudents (Model model) {
        model.addAttribute("students", studentRepository.getStudentList());

        return "/admin/students";
    }

    @RequestMapping(value = "/admin/student/create", method = RequestMethod.GET)
    public String create(Model model, Model categoryModel) {
        model.addAttribute("studentModel", new StudentModel());

        return "/admin/student/create";
    }
    @RequestMapping(value = "/admin/student/create", method = RequestMethod.POST)
    public String create(@ModelAttribute StudentModel studentModel, RedirectAttributes rdt) {
        String msg = studentRepository.createStudent(studentModel);

        rdt.addFlashAttribute("message", msg);

        return "redirect:/admin/students";
    }
}
