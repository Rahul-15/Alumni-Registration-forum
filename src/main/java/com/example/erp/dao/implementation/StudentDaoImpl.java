package com.example.erp.dao.implementation;

import com.example.erp.bean.Students;
import com.example.erp.bean.alumni;
import com.example.erp.dao.StudentDao;
import com.example.erp.utils.SessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class StudentDaoImpl implements StudentDao {

    @Override
    public Students emailVerify(Students student) {
        try (Session session = SessionUtil.getSession()) {
            Query query = session.createQuery("from Students where first_name=:first_name and last_name=:last_name and graduation_year=:graduation_year");
            query.setParameter("first_name", student.getFirst_name());
            query.setParameter("last_name", student.getLast_name());
            query.setParameter("graduation_year", student.getGraduation_year());
            for (final Object fetch : query.list()) {
                return (Students) fetch;
            }
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return null;
        }
        return null;
    }

    @Override
    public boolean registerStudent(Students student) {
        try (Session session = SessionUtil.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
            return true;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return false;
        }
    }

    @Override
    public boolean updateStudent(Integer s_id, alumni alumni){
        try (Session session = SessionUtil.getSession()) {
            Query query = session.createQuery("from Students where student_id=:s_id");
            query.setParameter("s_id", s_id);

            Students students = null;
            for (final Object fetch : query.list()) {
                students = (Students) fetch;
            }
            students.setAlumni(alumni);

            Transaction transaction = session.beginTransaction();
            session.update(students);
            transaction.commit();
            return true;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return false;
        }
    }

    @Override
    public Students getStudentByID(Integer s_id){
        try (Session session = SessionUtil.getSession()) {
            Query query = session.createQuery("from Students where student_id=:s_id");
            query.setParameter("s_id", s_id);

            Students students = null;
            for (final Object fetch : query.list()) {
                return (Students) fetch;
            }

        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
        }
        return null;
    }

}
