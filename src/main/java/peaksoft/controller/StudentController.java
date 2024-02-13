package peaksoft.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import peaksoft.entiity.Student;
import peaksoft.service.StudentService;
import peaksoft.service.StudentServiceImpl;

import java.util.List;

/**
 * @author Mukhammed Asantegin
 */

@Controller
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public String findAll(Model model){
        List<Student> students = studentService.findAll();
        model.addAttribute("allStudents", students);
        return "students-card";
    }

    @GetMapping("/new")
    public String create(Model model){
        model.addAttribute("newStudent", new Student());
        return "new-student";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("newStudent") Student student){
        studentService.save(student);
        return "redirect: /api/students";
    }

}
