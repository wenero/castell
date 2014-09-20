package com.tecsup.castell.controller.vendedor;

import com.tecsup.castell.model.Persona;
import com.tecsup.castell.model.Vendedor;
import java.util.List;


public interface VendedorService{
    
    List<Vendedor> allVendedor();
    
    Persona findVendedor(Long id);
    
    void save(Persona persona);
    
    void delete(Long id);
    
    void changeEstado(Long id);
    
}
