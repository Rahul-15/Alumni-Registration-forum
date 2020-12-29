package com.example.erp.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Students")
public class Students implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer student_id;

    private String first_name;
    private String last_name;
    @Column(nullable = false, unique = false)
    private Integer graduation_year;

    @OneToOne
    private alumni alumni;

    public Students() {
    }

    public Students(String first_name, String last_name, Integer graduation_year) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.graduation_year = graduation_year;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }


    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }


    public Integer getGraduation_year() {
        return graduation_year;
    }

    public void setGraduation_year(Integer graduation_year) {
        this.graduation_year = graduation_year;
    }

    public com.example.erp.bean.alumni getAlumni() {
        return alumni;
    }

    public void setAlumni(com.example.erp.bean.alumni alumni) {
        this.alumni = alumni;
    }
}
