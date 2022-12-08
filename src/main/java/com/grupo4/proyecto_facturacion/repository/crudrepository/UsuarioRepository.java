package com.grupo4.proyecto_facturacion.repository.crudrepository;

import com.grupo4.proyecto_facturacion.entities.UsuarioEntitie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UsuarioRepository extends JpaRepository <UsuarioEntitie,Integer>{
}
