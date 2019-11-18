package cargahoraria.com.pe.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cargahoraria.com.pe.repositorios.Disponibilidad_DocRepositorio;

@Service
@Transactional
public class Disponibilidad_DocServicios {

	@Autowired
	private Disponibilidad_DocRepositorio repositorio;
	
	public Disponibilidad_DocServicios() {
		// TODO Auto-generated constructor stub
	}

}
