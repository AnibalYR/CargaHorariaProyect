package cargahoraria.com.pe.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cargahoraria.com.pe.repositorios.GrupoRepositorio;

@Service
@Transactional
public class GrupoServicios {
    
	@Autowired
	private GrupoRepositorio repositorio;
	
	public GrupoServicios() {
		// TODO Auto-generated constructor stub
	}

}
