package com.prueba.fabrica.ropa.entidades;

/**
 * Entidad que representa la ropa, para usarla en el repositorio.
 * 
 * @author alvaro
 *
 */
public class Ropa {
	
	private int id;
	private String nombre;
	private double precio;
	
	/**
	 * Constructor por defecto.
	 */
	public Ropa() {
		super();
	}
	
	/**
	 * Constructor con todos los parametros.
	 * @param id
	 * @param nombre
	 * @param precio
	 */
	public Ropa(int id,String nombre, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	// --------------- GUETTERS AND SETTERS --------------------
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
