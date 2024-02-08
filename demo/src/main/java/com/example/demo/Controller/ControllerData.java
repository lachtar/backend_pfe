package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.ColumnDataService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class ControllerData {

    private final ColumnDataService columnDataService;

    @Autowired
    public ControllerData(ColumnDataService columnDataService) {
        this.columnDataService = columnDataService;
    }

    @PostMapping("/save_Datacolumn")
    public void updateColumnNames(@RequestBody List<String> columnData) {

        columnDataService.saveColumnData(columnData);

    }
}
