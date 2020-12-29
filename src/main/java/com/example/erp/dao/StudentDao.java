package com.example.erp.dao;

import com.example.erp.bean.Students;
import com.example.erp.bean.alumni;

public interface StudentDao {

    Students emailVerify(Students student);
    boolean registerStudent(Students student);
    boolean updateStudent(Integer s_id, alumni alumni);
    public Students getStudentByID(Integer s_id);
}
