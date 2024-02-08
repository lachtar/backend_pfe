package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Table_Data;

public interface ColumnDataRepos extends JpaRepository<Table_Data, Long> {

}