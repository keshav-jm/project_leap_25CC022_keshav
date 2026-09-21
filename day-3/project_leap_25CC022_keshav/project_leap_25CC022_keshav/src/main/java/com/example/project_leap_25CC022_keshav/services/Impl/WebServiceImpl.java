package com.example.project_leap_25CC022_keshav.services.Impl;


import com.example.project_leap_25CC022_keshav.Repository.WebRepository;
import com.example.project_leap_25CC022_keshav.model.Student;
import com.example.project_leap_25CC022_keshav.services.WebServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebServiceImpl implements WebServices {
    @Autowired
    private WebRepository webRepository;

    @Override
    public Student saveStudent(Student student) {

        return webRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        webRepository.deleteById(id);
    }

    @Override
    public List<Student> readStudent() {
        return webRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student) {

        return webRepository.save(student);
    }
}

