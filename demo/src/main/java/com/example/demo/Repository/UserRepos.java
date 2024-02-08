package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Table_Name;

public interface UserRepos extends JpaRepository<Table_Name, Long> {

}
