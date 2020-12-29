package com.example.erp.bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "Alumni")
public class alumni {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer alumni_id;

    private String email;
    private Long contact_Number;

    @OneToMany
    private Collection<alumniOrganisation> alumniOrganisationCollection = new ArrayList<alumniOrganisation>();

    public alumni(String email, Long contact_Number, Collection<alumniOrganisation> alumniOrganisationCollection) {
        this.email = email;
        this.contact_Number = contact_Number;
        this.alumniOrganisationCollection = alumniOrganisationCollection;
    }

    public alumni(String email, Long contact_Number) {
        this.email = email;
        this.contact_Number = contact_Number;
    }

    public alumni(){

    }

    public Integer getAlumni_id() {
        return alumni_id;
    }

    public void setAlumni_id(Integer alumni_id) {
        this.alumni_id = alumni_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getContact_Number() {
        return contact_Number;
    }

    public void setContact_Number(Long contact_Number) {
        this.contact_Number = contact_Number;
    }

    public Collection<alumniOrganisation> getAlumniOrganisationCollection() {
        return alumniOrganisationCollection;
    }

    public void setAlumniOrganisationCollection(Collection<alumniOrganisation> alumniOrganisationCollection) {
        this.alumniOrganisationCollection = alumniOrganisationCollection;
    }
}
