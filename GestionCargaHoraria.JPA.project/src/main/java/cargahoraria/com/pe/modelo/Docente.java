package cargahoraria.com.pe.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "docentes")
public class Docente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Basic(optional = false)
	@Column(name= "IdDocente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name= "nombres")
	private String nombre;
	@Column(name= "apellidos")
	private String apellido;
	@Column(name= "dni")
	private Integer dni;
	@Column(name= "sexo")
	private String sexo;
	@Column(name= "Fecha_nac")
	private String fecha_nac;
	@Column(name= "telefono")
	private Integer telefono;
	@Column(name= "especialidad")
	private String especialidad;
	@Column(name= "correo")
	private String correo;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "docente")
	private List<Disponibilidad_Doc> disponibilidad_DocsList;
	@OneToMany(cascade = CascadeType.ALL,  mappedBy = "docente")
    private List<Asig_Horario> asig_HorariasList;
	

	public Docente() {
		// TODO Auto-generated constructor stub
	}


	public Docente(Integer id, String nombre, String apellido, Integer dni, String sexo, String fecha_nac,
			Integer telefono, String especialidad, String correo, List<Disponibilidad_Doc> disponibilidad_DocsList,
			List<Asig_Horario> asig_HorariasList) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sexo = sexo;
		this.fecha_nac = fecha_nac;
		this.telefono = telefono;
		this.especialidad = especialidad;
		this.correo = correo;
		this.disponibilidad_DocsList = disponibilidad_DocsList;
		this.asig_HorariasList = asig_HorariasList;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Integer getDni() {
		return dni;
	}


	public void setDni(Integer dni) {
		this.dni = dni;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getFecha_nac() {
		return fecha_nac;
	}


	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}


	public Integer getTelefono() {
		return telefono;
	}


	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}


	public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public List<Disponibilidad_Doc> getDisponibilidad_DocsList() {
		return disponibilidad_DocsList;
	}


	public void setDisponibilidad_DocsList(List<Disponibilidad_Doc> disponibilidad_DocsList) {
		this.disponibilidad_DocsList = disponibilidad_DocsList;
	}


	public List<Asig_Horario> getAsig_HorariasList() {
		return asig_HorariasList;
	}


	public void setAsig_HorariasList(List<Asig_Horario> asig_HorariasList) {
		this.asig_HorariasList = asig_HorariasList;
	}


	
	
}
