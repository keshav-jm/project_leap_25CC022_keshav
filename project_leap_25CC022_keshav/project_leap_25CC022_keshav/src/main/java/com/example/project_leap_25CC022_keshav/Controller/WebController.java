package com.example.project_leap_25CC022_keshav.Controller;

import com.example.project_leap_25CC022_keshav.Repository.Impl.WebRepositoryImpl;
import com.example.project_leap_25CC022_keshav.services.Impl.WebServiceImpl;
import com.example.project_leap_25CC022_keshav.services.WebServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @Autowired
    WebServices webServices;
    @PostMapping("/data/write")
    String writeData(String data)
    {
         return webServices.writeDate(data);
    }
    @GetMapping("data/get")
    String getData()
    {
        return webServices.readData();
    }

}


