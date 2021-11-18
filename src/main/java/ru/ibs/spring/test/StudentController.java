package ru.ibs.spring.test;

import org.apache.catalina.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

@Controller
public class StudentController {

    @PostConstruct
    private void postConstruct() {
        StudentStorage.getStudentList().add(new Student("Oleg", LocalDateTime.now()));
        StudentStorage.getStudentList().add(new Student("Anastasya", LocalDateTime.now()));
        StudentStorage.getStudentList().add(new Student("Kristina", LocalDateTime.now()));
    }

    @GetMapping("show")
    public String show(Model model) {
        model.addAttribute("studentList", StudentStorage.getStudentList());
        return "show";
    }

    @GetMapping("add")
    public String add() {

        return "add";
    }

    @PostMapping("add")
    public String addPost(@RequestParam("name") String name, Model model) {
        StudentStorage.getStudentList().add(new Student(name, LocalDateTime.now()));
        model.addAttribute("studentList", StudentStorage.getStudentList());
        return "show";
    }





  /*  @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("student", "command", new Student());
    }*/






 /*   @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("student") Student student, ModelMap model) {

        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("id", student.getId());

        return "result";
    }*/

}
