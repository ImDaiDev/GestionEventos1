package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Utils {
	static List<Usuario> listaUsuarios = new ArrayList<>();
	static List<Usuario> listaNormales = new ArrayList<>();
	static List<Usuario> listaAdmin = new ArrayList<>();
	static List<Pelicula> listaPelicula = new ArrayList<>();
	static List<Inscripcion> listaInsc = new ArrayList<>(); 
	
	public static List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}
	public static void setListaUsuarios(List<Usuario> listaUsuarios) {
		Utils.listaUsuarios = listaUsuarios;
	}
	public static List<Usuario> getListaNormales() {
		return listaNormales;
	}
	public static void setListaNormales(List<Usuario> listaNormales) {
		Utils.listaNormales = listaNormales;
	}
	public static List<Usuario> getListaAdmin() {
		return listaAdmin;
	}
	public static void setListaAdmin(List<Usuario> listaAdmin) {
		Utils.listaAdmin = listaAdmin;
	}
	
	public static void separarUsuarios() {
		for(Usuario us: listaUsuarios) {
			if(us.getAdmin() == true) {
				listaAdmin.add(us);
			} else
				listaNormales.add(us);
		}
	}
	
	public static List<Pelicula> getListaPelicula() {
		return listaPelicula;
	}
	
	public static void setListaPelicula(List<Pelicula> listaPelicula) {
		Utils.listaPelicula = listaPelicula;
	}
	
	public static List<Inscripcion> getListaInsc() {
		return listaInsc;
	}
	
	public static void setListaInsc(List<Inscripcion> listaInsc) {
		Utils.listaInsc = listaInsc;
	}
	
	
}
