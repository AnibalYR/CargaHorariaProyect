package cargahoraria.com.pe.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cargahoraria.com.pe.repositorios.AulaRepositorio;

@Service
@Transactional
public class AulaServicios {

	@Autowired
	private AulaRepositorio repositorio;
	
	public AulaServicios() {
		// TODO Auto-generated constructor stub
	}

}
