package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

@Entity
@Table(name = "ColumnType", schema = "system")
public class ColumnType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_column;

    @Column(name = "column_Name")
    private String column_Name;

    private String column_type;
    private String Table_name;
    private Boolean isNull;

    public ColumnType() {

    }

    // Add the setter methods for the columnName and columnType attributes
    public void setColumnName(String columnName) {
        this.column_Name = columnName;
    }

    public void setColumnType(String columnType) {
        this.column_type = columnType;
    }

}
