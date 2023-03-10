package com.sda.dao;
import com.sda.model.User;
import org.hibernate.Session;

import static com.sda.db.HibernateUtils.getSessionFactory;

public class UsersDAO {

    public void createUser(User user){

        try(Session session = getSessionFactory().openSession()){ // od razu zamyka tez sesje w przypadku Exception
            session.beginTransaction();
            session.persist(user);
            session.getTransaction().commit();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}