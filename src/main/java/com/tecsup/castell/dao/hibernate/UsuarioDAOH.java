package com.tecsup.castell.dao.hibernate;

import com.tecsup.castell.dao.UsuarioDAO;
import com.tecsup.castell.helper.EstadoEnum;
import com.tecsup.castell.model.Usuario;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioDAOH extends BaseHibernateDAO implements UsuarioDAO {

    @Override
    public List<Usuario> all() {
        Criteria criteria = this.getSession().createCriteria(Usuario.class);
        return criteria.list();
    }

    @Override
    public Usuario find(Long id) {
        Criteria criteria = this.getSession().createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("id", id));
        return (Usuario) criteria.uniqueResult();
    }

    @Override
    public void save(Usuario t) {
        this.getSession().save(t);
    }

    @Override
    public void update(Usuario t) {
        this.getSession().merge(t);
    }

    @Override
    public void delete(Usuario t) {
        this.getSession().delete(t);
    }

    @Override
    public Usuario findByLogin(String usuario) {
        Criteria criteria = this.getSession().createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("username", usuario));
        criteria.add(Restrictions.eq("estado", EstadoEnum.ACTIVO.toString()));
        return (Usuario) criteria.uniqueResult();
    }

}
