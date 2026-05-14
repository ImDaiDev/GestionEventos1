package Modelo;

public class Inscripcion {
	int idUsuario, idPelicula;

	public Inscripcion() {
		super();
	}

	public Inscripcion(int idUsuario, int idPelicula) {
		super();
		this.idUsuario = idUsuario;
		this.idPelicula = idPelicula;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	@Override
	public String toString() {
		return "Inscripcion [idUsuario=" + idUsuario + ", idPelicula=" + idPelicula + "]";
	}
	
	
}
