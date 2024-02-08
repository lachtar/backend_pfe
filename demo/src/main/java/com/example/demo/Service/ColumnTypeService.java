package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.Model.ColumnType;
import com.example.demo.Repository.ColumnTypeRepository;

import java.util.List;

@Service
@Transactional
public class ColumnTypeService {

    private final ColumnTypeRepository columnTypeRepository;

    @Autowired
    public ColumnTypeService(ColumnTypeRepository columnTypeRepository) {
        this.columnTypeRepository = columnTypeRepository;
    }

    public void saveColumnNames(List<String> columnNames) {
        for (String columnName : columnNames) {
            ColumnType newColumnType = new ColumnType();
            newColumnType.setColumnName(columnName);
            // Set other attributes as needed
            columnTypeRepository.save(newColumnType);
        }
    }
}