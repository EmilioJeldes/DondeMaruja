package modelo;

import java.util.Date;

public class User {

	private int id;
	private int rut;
	private String Nombre;
	private String Apellido;
	private Date fechaNacimiento;
	private int edad;
	private String estadoCivil;
	private String email;
	private String contraseña;
	private long telefono;
	private boolean logeado;

	public User() {
		this.id = 0;
		this.rut = 0;
		this.edad = 0;
		this.telefono = 0;
		this.logeado = false;
	}

	public User(int rut, String Nombre, String Apellido, Date fechaNacimiento, int edad, String estadoCivil, String email, String contraseña, int telefono) {
		this.id = 0;
		this.logeado = false;
		this.rut = rut;
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.estadoCivil = estadoCivil;
		this.email = email;
		this.contraseña = contraseña;
		this.telefono = telefono;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String Apellido) {
		this.Apellido = Apellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public boolean isLogeado() {
		return logeado;
	}

	public void setLogeado(boolean logeado) {
		this.logeado = logeado;
	}

}
