package cargahoraria.com.pe.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cargahoraria.com.pe.repositorios.CarreraRepositorio;

@Service
@Transactional
public class CarreraServicios {

	@Autowired
	private CarreraRepositorio repositorio;
	
	public CarreraServicios() {
		// TODO Auto-generated constructor stub
	}

}
