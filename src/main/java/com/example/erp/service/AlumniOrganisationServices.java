package com.example.erp.service;

import com.example.erp.bean.alumniOrganisation;
import com.example.erp.dao.implementation.AlumniOrganisationDaoImpl;

public class AlumniOrganisationServices {
    AlumniOrganisationDaoImpl alumniOrganisationDao = new AlumniOrganisationDaoImpl();
    public boolean registerOrganisation(alumniOrganisation alumniOrganisation){ return alumniOrganisationDao.registerOrganisation(alumniOrganisation);}
}
