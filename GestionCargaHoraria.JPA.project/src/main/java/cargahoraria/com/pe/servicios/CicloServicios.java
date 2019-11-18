package cargahoraria.com.pe.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cargahoraria.com.pe.repositorios.CicloRepositorio;

@Service
@Transactional
public class CicloServicios {

	@Autowired
	private CicloRepositorio repositorio;
	
	public CicloServicios() {
		// TODO Auto-generated constructor stub
	}

}
