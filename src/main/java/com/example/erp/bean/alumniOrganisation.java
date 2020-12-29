package com.example.erp.bean;

import javax.persistence.*;

@Entity
@Table(name = "Alumni_Organisation")
public class alumniOrganisation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer alumniOrganisation_id;

    private String organisation_Name;
    private String postion;
    private Integer joining_Year;
    private Integer leaving_Year;

    public alumniOrganisation(String organisation_Name, String postion, Integer joining_Year, Integer leaving_Year) {
        this.organisation_Name = organisation_Name;
        this.postion = postion;
        this.joining_Year = joining_Year;
        this.leaving_Year = leaving_Year;
    }

    public alumniOrganisation(){

    }

    public Integer getAlumniOrganisation_id() {
        return alumniOrganisation_id;
    }

    public void setAlumniOrganisation_id(Integer alumniOrganisation_id) {
        this.alumniOrganisation_id = alumniOrganisation_id;
    }

    public String getOrganisation_Name() {
        return organisation_Name;
    }

    public void setOrganisation_Name(String organisation_Name) {
        this.organisation_Name = organisation_Name;
    }

    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        this.postion = postion;
    }

    public Integer getJoining_Year() {
        return joining_Year;
    }

    public void setJoining_Year(Integer joining_Year) {
        this.joining_Year = joining_Year;
    }

    public Integer getLeaving_Year() {
        return leaving_Year;
    }

    public void setLeaving_Year(Integer leaving_Year) {
        this.leaving_Year = leaving_Year;
    }
}
