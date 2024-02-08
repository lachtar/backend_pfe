package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.Model.Table_Data; // Assurez-vous d'avoir cette classe importée
import com.example.demo.Repository.ColumnDataRepos;

import java.util.List;

@Service
@Transactional
public class ColumnDataService {

    private final ColumnDataRepos columnDataRepos;

    @Autowired
    public ColumnDataService(ColumnDataRepos columnDataRepos) {
        this.columnDataRepos = columnDataRepos;
    }

    public void saveColumnData(List<String> columnDataList) {
        for (String columnData : columnDataList) {
            Table_Data newColumnData = new Table_Data();
            newColumnData.setColumnData(columnData);
            // Set other attributes as needed
            columnDataRepos.save(newColumnData);
        }
    }
}
