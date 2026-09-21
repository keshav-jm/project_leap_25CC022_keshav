package com.example.project_leap_25CC022_keshav.Controller;

import com.example.project_leap_25CC022_keshav.model.Student;
import com.example.project_leap_25CC022_keshav.services.WebServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WebController {

    @Autowired
    WebServices webServices;

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return webServices.saveStudent(student);
    }
    @GetMapping("/Details")
    public List<Student> getStudent()
    {
        return webServices.readStudent();
    }

    @DeleteMapping("Erase")
    public String deleteStudent(@RequestParam("id") Long id) {
        webServices.deleteStudent(id);
        return "Student deleted successfully";
    }
}