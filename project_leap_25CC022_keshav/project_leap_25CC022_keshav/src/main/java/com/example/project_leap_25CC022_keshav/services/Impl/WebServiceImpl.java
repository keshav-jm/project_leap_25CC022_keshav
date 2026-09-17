package com.example.project_leap_25CC022_keshav.services.Impl;

import com.example.project_leap_25CC022_keshav.Repository.Impl.WebRepositoryImpl;
import com.example.project_leap_25CC022_keshav.Repository.WebRepository;
import com.example.project_leap_25CC022_keshav.services.WebServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebServiceImpl implements WebServices {
    @Autowired
    WebRepository webRepository;
    @Override
    public String writeDate(String data) {
        return webRepository.writeData(data);
    }

    @Override
    public String readData() {
        return webRepository.readData();
    }
}

