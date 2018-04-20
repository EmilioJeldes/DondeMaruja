package command;

import java.util.Date;

public class UserCommand {

	private int id;
	private int rut;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private int edad;
	private String estadoCivil;
	private String email;
	private String contraseña;
	private long telefono;
	private boolean logeado;

	public UserCommand() {
		logeado = false;
		id = 0;
		rut = 0;
		edad = 0;
		telefono = 0L;
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

	public void setRut(int rut) throws RuntimeException {
		if (rut < 23000000) {
			this.rut = rut;
		} else {
			throw new RuntimeException("Rut no debe tener puntos ni guiones");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws RuntimeException {
		if (nombre.length() >= 3) {
			this.nombre = nombre;
		} else {
			throw new RuntimeException("Ingrese un nombre real");
		}
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) throws RuntimeException {
		if (apellido.length() >= 3) {
			this.apellido = apellido;
		} else {
			throw new RuntimeException("Ingrese un apellido real");
		}

	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		if (fechaNacimiento != null) {
			this.fechaNacimiento = fechaNacimiento;
		} else {
			throw new RuntimeException("Fecha de nacimiento no ingresada");
		}
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws RuntimeException {
		if (edad > 0 && edad < 110) {
			this.edad = edad;
		} else {
			throw new RuntimeException("Ingrese una edad real");
		}
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) throws RuntimeException {
		if (estadoCivil.length() > 5) {
			this.estadoCivil = estadoCivil;
		} else {
			throw new RuntimeException("Seleccione un estado civil");
		}
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

	public void setTelefono(long telefono) throws RuntimeException {
		if (telefono < 56999999999L) {
			this.telefono = telefono;
		} else {
			throw new RuntimeException("Ingrese un telefono real");
		}
	}

	public boolean isLogeado() {
		return logeado;
	}

	public void setLogeado(boolean logeado) {
		this.logeado = logeado;
	}

}
