package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.ColumnType;

public interface ColumnTypeRepository extends JpaRepository<ColumnType, Long> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}
