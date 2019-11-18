package cargahoraria.com.pe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import cargahoraria.com.pe.modelo.Docente;
import cargahoraria.com.pe.modelo.Usuario;
import cargahoraria.com.pe.servicios.DocenteServicios;
import cargahoraria.com.pe.servicios.UsuarioServicios;



@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext  ctx  =  SpringApplication.run(Application.class, args);
	//crearUsuario(ctx);
	//eliminarUsuario(ctx);
	//crearDocente(ctx);
	//eliminarDocente(ctx);
	
	
	}
	private static void crearUsuario(ConfigurableApplicationContext ctx) {
		UsuarioServicios servicio = ctx.getBean(UsuarioServicios.class);
		Usuario nuevoUsuario = new Usuario(9,"Mariela", "Castillo","use","administrador");
		servicio.crear(nuevoUsuario);
	}
	
	private static void eliminarUsuario(ConfigurableApplicationContext ctx) {
		UsuarioServicios servicio = ctx.getBean(UsuarioServicios.class);
		servicio.borrarPorID(1);
	}
	
	private static void crearDocente(ConfigurableApplicationContext ctx) {
		DocenteServicios servicio = ctx.getBean(DocenteServicios.class);
		Docente nuevoDocente = new Docente(9,"Pedro","Ruiz",71092388,"M","1998-15-10",963258741,"Base de Datos","pedroruiz@gmail.com", null, null);
		servicio.crear(nuevoDocente);
	}
	
	private static void eliminarDocente(ConfigurableApplicationContext ctx) {
		DocenteServicios servicio = ctx.getBean(DocenteServicios.class);
		servicio.borrarPorID(1);
	}
}
