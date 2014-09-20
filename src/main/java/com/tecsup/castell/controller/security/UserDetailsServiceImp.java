package com.tecsup.castell.controller.security;

import com.tecsup.castell.dao.UsuarioDAO;
import com.tecsup.castell.model.Usuario;
import java.util.ArrayList;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userDetailsService")
@Transactional(readOnly = true)
public class UserDetailsServiceImp implements UserDetailsService {

    @Autowired
    private UsuarioDAO usuarioDAO;

    @Override
    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {

        Usuario usuario = usuarioDAO.findByLogin(string);

        if (usuario == null) {
            throw new UsernameNotFoundException("Usuario no encontrado");
        }

        String username = usuario.getUsername();
        String password = usuario.getPassword();

        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority(usuario.getRol()));
        return new User(username, password, authorities);
    }

}
