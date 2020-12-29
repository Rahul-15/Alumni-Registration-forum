package com.example.erp.service;

import com.example.erp.bean.alumni;
import com.example.erp.bean.alumniOrganisation;
import com.example.erp.dao.implementation.AlumniDaoImpl;

public class AlumniServices {
    AlumniDaoImpl alumniDao = new AlumniDaoImpl();
    public boolean registerAlumni(alumni alumni){return alumniDao.registerAlumni(alumni);}
    public boolean updateAlumni(Integer a_id, alumniOrganisation alumniOrganisation){ return alumniDao.updateAlumni(a_id,alumniOrganisation);}
}
