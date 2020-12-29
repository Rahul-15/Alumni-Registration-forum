package com.example.erp.bean;

public class RequestBodyOrg {
    private String organisation_Name;
    private String postion;
    private String joining_Year;
    private String leaving_Year;
    private Integer id;

    public RequestBodyOrg(){

    }

    public RequestBodyOrg(String organisation_Name, String postion, String joining_Year, String leaving_Year, Integer id) {
        this.organisation_Name = organisation_Name;
        this.postion = postion;
        this.joining_Year = joining_Year;
        this.leaving_Year = leaving_Year;
        this.id = id;
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

    public String getJoining_Year() {
        return joining_Year;
    }

    public void setJoining_Year(String joining_Year) {
        this.joining_Year = joining_Year;
    }

    public String getLeaving_Year() {
        return leaving_Year;
    }

    public void setLeaving_Year(String leaving_Year) {
        this.leaving_Year = leaving_Year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
