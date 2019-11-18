package cargahoraria.com.pe.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cargahoraria.com.pe.repositorios.CursoRepositorio;

@Service
@Transactional
public class CursoServicios {

	@Autowired
	private CursoRepositorio repositorio;
	
	public CursoServicios() {
		// TODO Auto-generated constructor stub
	}

}
