package Modelo;

import java.util.Random;

public class Usuario {
<<<<<<< HEAD
	private Integer id, edad;
	private String nombre, rol, email, passw;
=======
	private int id, edad;
	private String nombre, email, passw;
	private boolean admin;
>>>>>>> 518e901a6a1adf94c851fcd502894305e17cf409
	
	public Usuario() {
		super();
	}

<<<<<<< HEAD
	public Usuario(Integer id, Integer edad, String nombre, String rol, String email, String passw) {
=======
	public Usuario(int edad, String nombre, boolean admin, String email, String passw) {
>>>>>>> 518e901a6a1adf94c851fcd502894305e17cf409
		super();
		this.id = generarId();
		this.edad = edad;
		this.nombre = nombre;
		this.admin = admin;
		this.email = email;
		this.passw = passw;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getEdad() {
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

	public boolean getAdmin() {
		return admin;
	}

	public void setRol(boolean admin) {
		this.admin = admin;
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
		return "Usuario [id=" + id + ", edad=" + edad + ", nombre=" + nombre + ", admin=" + admin + ", email=" + email
				+ ", passw=" + passw + "]";
	}
	
	public int generarId() {
		Random r = new Random();
		boolean repetido = false;
		int newId;
		do {
			repetido = false;
			newId = r.nextInt(0, 1000000);
			for(Usuario user: Utils.getListaUsuarios()) {
				if(user.getId() == newId)
					repetido = true;
			}
		} while (repetido);
		return newId;
		
	}
}
