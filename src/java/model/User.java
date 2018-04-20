package model;

import java.util.Date;

public class User {

	private Integer id;
	private int rut;
	private String name;
	private String lastName;
	private Date birthDate;
	private int age;
	private String civilStatus;
	private String email;
	private String password;
	private long phoneNumber;
	private boolean logged;

	public User() {
		this.id = 0;
		this.rut = 0;
		this.age = 0;
		this.phoneNumber = 0;
		this.logged = false;
	}

	public User(int rut, String Nombre, String Apellido, Date fechaNacimiento, int edad, String estadoCivil, String email, String contraseña, int telefono) {
		this.id = 0;
		this.logged = false;
		this.rut = rut;
		this.name = Nombre;
		this.lastName = Apellido;
		this.birthDate = fechaNacimiento;
		this.age = edad;
		this.civilStatus = estadoCivil;
		this.email = email;
		this.password = contraseña;
		this.phoneNumber = telefono;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCivilStatus() {
		return civilStatus;
	}

	public void setCivilStatus(String civilStatus) {
		this.civilStatus = civilStatus;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isLogged() {
		return logged;
	}

	public void setLogged(boolean logged) {
		this.logged = logged;
	}

}
