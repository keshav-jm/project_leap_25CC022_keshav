package com.example.project_leap_25CC022_keshav.Controller;

import com.example.project_leap_25CC022_keshav.Model.student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WebController {

    @GetMapping("/calc")
    int calculate(int a, int b, String operation) {

        switch (operation) {
            case "+" -> {
                return a + b;
            }
            case "-" -> {
                return a - b;
            }
            case "*" -> {
                return a * b;
            }
            case "/" -> {
                return a / b;
            }
            default -> {
                return 0;
            }
        }
    }

    @GetMapping("/student")
    public List<student> getStudentDetails() {

        student s1 = new student();

        s1.setName("Keshav");
        s1.setDept("CCE");
        s1.setRollno("25CC022");
        s1.setIsactive(true);
        s1.setUsername("Keshav");

        student s2 = new student();

        s2.setName("Mano");
        s2.setDept("EEE");
        s2.setRollno("25CC021");
        s2.setIsactive(false);
        s2.setUsername("Mano");

        List<student> students = new ArrayList<>();

        students.add(s1);
        students.add(s2);

        return students;
    }
}