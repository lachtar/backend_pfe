package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Table_Data", schema = "system")
public class Table_Data {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "table_name_id", referencedColumnName = "id")
    private Table_Name table_Name;

    @ManyToOne
    @JoinColumn(name = "column_name_id", referencedColumnName = "id_column")
    private ColumnType column_Name;

    @Column(name = "column_Data")
    private String column_Data;

    public void setColumnData(String columnData) {
        this.column_Data = columnData;
    }

}
