package com.tecsup.castell.dao.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class BaseHibernateDAO extends HibernateDaoSupport {

    @Autowired
    public void initSession(SessionFactory sessionFactory) {
        setSessionFactory(sessionFactory);
    }

}
