package com.example.project_leap_25CC022_keshav.Repository;

import com.example.project_leap_25CC022_keshav.services.WebServices;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

@Repository
public interface WebRepository {
    String writeData(String data);
    String readData();
}
