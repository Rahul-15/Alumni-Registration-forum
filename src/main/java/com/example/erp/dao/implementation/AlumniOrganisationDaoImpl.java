package com.example.erp.dao.implementation;

import com.example.erp.bean.alumniOrganisation;
import com.example.erp.utils.SessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AlumniOrganisationDaoImpl {
    public boolean registerOrganisation(alumniOrganisation alumniOrganisation){
        try (Session session = SessionUtil.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(alumniOrganisation);
            transaction.commit();
            return true;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return false;
        }
    }
}
