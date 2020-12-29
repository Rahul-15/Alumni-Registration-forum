package com.example.erp.service;

import com.example.erp.bean.Students;
import com.example.erp.bean.alumni;
import com.example.erp.dao.StudentDao;
import com.example.erp.dao.implementation.StudentDaoImpl;

public class StudentService {
    StudentDao studentDao = new StudentDaoImpl();
    public Students verifyEmail(Students student){
        return studentDao.emailVerify(student);
    }

    public boolean registerStudent(Students student){
        return studentDao.registerStudent(student);
    }
    public boolean updateStudent(Integer s_id, alumni alumni){return studentDao.updateStudent(s_id,alumni);}
    public Students getStudentByID(Integer s_id){ return studentDao.getStudentByID(s_id);}
}
