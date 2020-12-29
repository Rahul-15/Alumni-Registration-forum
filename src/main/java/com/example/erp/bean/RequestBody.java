package com.example.erp.bean;

public class RequestBody {

    private Integer id;
    private String email;
    private String contact_Number;

    public RequestBody( String email, String contact_Number,Integer id) {
        this.id = id;
        this.email = email;
        this.contact_Number = contact_Number;
    }

    public RequestBody(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact_Number() {
        return contact_Number;
    }

    public void setContact_Number(String contact_Number) {
        this.contact_Number = contact_Number;
    }
}
