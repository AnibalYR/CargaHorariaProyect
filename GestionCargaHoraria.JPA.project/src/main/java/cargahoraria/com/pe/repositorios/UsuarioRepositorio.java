package cargahoraria.com.pe.repositorios;

import org.springframework.data.repository.CrudRepository;

import cargahoraria.com.pe.modelo.Grupo;
import cargahoraria.com.pe.modelo.Usuario;

public interface UsuarioRepositorio extends CrudRepository<Usuario, Integer> {

}
