package Modelo;

public class Pelicula {
	private Integer id, maxAssist;
	private String nombre, fecha, rutaImg;
	
	public Pelicula() {
		super();
	}

	public Pelicula(Integer id, Integer maxAssist, String nombre, String fecha, String rutaImg) {
		super();
		this.id = id;
		this.maxAssist = maxAssist;
		this.nombre = nombre;
		this.fecha = fecha;
		this.rutaImg = rutaImg;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getMaxAssist() {
		return maxAssist;
	}

	public void setMaxAssist(int maxAssist) {
		this.maxAssist = maxAssist;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getRutaImg() {
		return rutaImg;
	}

	public void setRutaImg(String rutaImg) {
		this.rutaImg = rutaImg;
	}

	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", maxAssist=" + maxAssist + ", nombre=" + nombre + ", fecha=" + fecha
				+ ", rutaImg=" + rutaImg + "]";
	}
	
	
}
