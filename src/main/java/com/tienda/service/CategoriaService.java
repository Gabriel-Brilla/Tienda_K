package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    
    // Se define la firma del metodo para obtener los registros de la tabla categoria
    
    public List<Categoria> getCategorias(boolean activo);
}
