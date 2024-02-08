// UserService.java
package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Model.Table_Name;
import com.example.demo.Repository.UserRepos;

@Service
public class service {

    private final UserRepos userRepos;

    @Autowired
    public service(UserRepos userRepos) {
        this.userRepos = userRepos;
    }

    public void saveTableName(String tableName) {
        Table_Name tableNameEntity = new Table_Name();
        tableNameEntity.setTable_name(tableName);
        userRepos.save(tableNameEntity);
    }

}
