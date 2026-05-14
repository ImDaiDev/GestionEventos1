package Modelo;

public class Usuario {
	private int id, edad;
	private String nombre, rol, email, passw;
	
	public Usuario() {
		super();
	}

	public Usuario(int id, int edad, String nombre, String rol, String email, String passw) {
		super();
		this.id = id;
		this.edad = edad;
		this.nombre = nombre;
		this.rol = rol;
		this.email = email;
		this.passw = passw;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassw() {
		return passw;
	}

	public void setPassw(String passw) {
		this.passw = passw;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", edad=" + edad + ", nombre=" + nombre + ", rol=" + rol + ", email=" + email
				+ ", passw=" + passw + "]";
	}
}
