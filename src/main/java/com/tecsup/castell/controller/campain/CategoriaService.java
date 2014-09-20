package com.tecsup.castell.controller.campain;

import com.tecsup.castell.model.Categoria;
import java.util.List;

public interface CategoriaService {

     List<Categoria> all();
    
    Categoria find(Long id);
    
    void save(Categoria categoria);
    
    void delete(Long id);
}
