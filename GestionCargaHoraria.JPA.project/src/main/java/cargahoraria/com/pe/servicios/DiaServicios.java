package cargahoraria.com.pe.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cargahoraria.com.pe.repositorios.DiaRepositorio;

@Service
@Transactional
public class DiaServicios {

	@Autowired
	private DiaRepositorio repositorio;
	
	public DiaServicios() {
		// TODO Auto-generated constructor stub
	}

}
