package com.tecsup.castell.dao;

import com.tecsup.castell.helper.GenericCrud;
import com.tecsup.castell.model.Usuario;

public interface UsuarioDAO extends GenericCrud<Usuario>{
    
    Usuario findByLogin(String usuario);
}
