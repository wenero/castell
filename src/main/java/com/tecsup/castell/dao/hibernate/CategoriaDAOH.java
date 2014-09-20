package com.tecsup.castell.dao.hibernate;

import com.tecsup.castell.dao.CategoriaDAO;
import com.tecsup.castell.model.Categoria;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
public class CategoriaDAOH extends BaseHibernateDAO implements CategoriaDAO {

    @Override
    public List<Categoria> all() {
        Criteria criteria = this.getSession().createCriteria(Categoria.class);
        return criteria.list();
    }

    @Override
    public Categoria find(Long id) {
        Criteria criteria = this.getSession().createCriteria(Categoria.class);
        criteria.add(Restrictions.eq("id", id));
        return (Categoria) criteria.uniqueResult();
    }

    @Override
    public void save(Categoria t) {
        this.getSession().save(t);
    }

    @Override
    public void update(Categoria t) {
        this.getSession().merge(t);
    }

    @Override
    public void delete(Categoria t) {
        this.getSession().delete(t);
    }

}
