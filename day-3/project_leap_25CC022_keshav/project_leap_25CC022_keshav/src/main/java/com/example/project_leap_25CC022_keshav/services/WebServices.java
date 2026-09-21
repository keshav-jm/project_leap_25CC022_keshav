package com.example.project_leap_25CC022_keshav.services;

import com.example.project_leap_25CC022_keshav.model.Student;
import org.apache.logging.log4j.message.StringFormattedMessage;
import org.hibernate.query.sqm.tuple.internal.AnonymousTupleEntityValuedModelPart;

import java.util.List;

public interface WebServices {
    Student saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student> readStudent();
    Student updateStudent(Student student);



}
