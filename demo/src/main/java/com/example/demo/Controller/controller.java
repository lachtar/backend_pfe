package com.example.demo.Controller;

import com.example.demo.Service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class controller {

    private final service service;

    @Autowired
    public controller(service service) {
        this.service = service;
    }

    @PostMapping("/saveTableName")
    public void saveTableName(@RequestBody String tableName) {
        service.saveTableName(tableName);
    }

}
