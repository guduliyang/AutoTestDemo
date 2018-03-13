package com.autotest.dao;

import com.autotest.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired(required = true)
    private SessionFactory sessionFactory;

    private void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session getSession(){
        return sessionFactory.openSession();
    }

    public User findOne(long id){
        return getSession().get(User.class,id);
    }
}
