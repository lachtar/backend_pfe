package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.ColumnTypeService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class Controller2 {

    private final ColumnTypeService columnTypeService;

    @Autowired
    public Controller2(ColumnTypeService columnTypeService) {
        this.columnTypeService = columnTypeService;
    }

    @PostMapping("/save_namecolumn")
    public void updateColumnNames(@RequestBody List<String> columnNames) {

        columnTypeService.saveColumnNames(columnNames);

    }
}
