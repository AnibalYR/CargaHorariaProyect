package cargahoraria.com.pe.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cargahoraria.com.pe.repositorios.Asig_HorariaRepositorio;

@Service
@Transactional
public class Asig_HorarioServicios {
	
	@Autowired
	private Asig_HorariaRepositorio repositorio;

	public Asig_HorarioServicios() {
		// TODO Auto-generated constructor stub
	}

}
