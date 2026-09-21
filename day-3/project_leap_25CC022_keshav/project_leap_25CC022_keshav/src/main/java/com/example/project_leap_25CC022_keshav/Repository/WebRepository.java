package com.example.project_leap_25CC022_keshav.Repository;

import com.example.project_leap_25CC022_keshav.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebRepository extends JpaRepository<Student, Long> {
}