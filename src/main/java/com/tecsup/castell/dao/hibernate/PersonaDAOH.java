package com.tecsup.castell.dao.hibernate;

import com.tecsup.castell.dao.PersonaDAO;
import com.tecsup.castell.model.Persona;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
public class PersonaDAOH extends BaseHibernateDAO implements PersonaDAO {

    @Override
    public List<Persona> all() {
        Criteria criteria = this.getSession().createCriteria(Persona.class);
        return criteria.list();
    }

    @Override
    public Persona find(Long id) {
        Criteria criteria = this.getSession().createCriteria(Persona.class);
        criteria.add(Restrictions.eq("id", id));
        return (Persona) criteria.uniqueResult();
    }

    @Override
    public void save(Persona t) {
        this.getSession().save(t);
    }

    @Override
    public void update(Persona t) {
        this.getSession().merge(t);
    }

    @Override
    public void delete(Persona t) {
        this.getSession().delete(t);
    }

}
