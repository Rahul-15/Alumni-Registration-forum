package com.example.erp.dao.implementation;

import com.example.erp.bean.Students;
import com.example.erp.bean.alumni;
import com.example.erp.bean.alumniOrganisation;
import com.example.erp.utils.SessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.Collection;

public class AlumniDaoImpl {
    public boolean registerAlumni(alumni alumni){
        try (Session session = SessionUtil.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(alumni);
            transaction.commit();
            return true;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return false;
        }
    }

    public boolean updateAlumni(Integer a_id, alumniOrganisation alumniOrganisation){
        try (Session session = SessionUtil.getSession()) {
            Query query = session.createQuery("from alumni where alumni_id=:a_id");
            query.setParameter("a_id", a_id);

            alumni alumni = null;
            for (final Object fetch : query.list()) {
                alumni = (alumni) fetch;
            }

            assert alumni != null;
            Collection<alumniOrganisation> al = alumni.getAlumniOrganisationCollection();
            al.add(alumniOrganisation);
            alumni.setAlumniOrganisationCollection(al);

            Transaction transaction = session.beginTransaction();
            session.update(alumni);
            transaction.commit();
            return true;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return false;
        }
    }
}
