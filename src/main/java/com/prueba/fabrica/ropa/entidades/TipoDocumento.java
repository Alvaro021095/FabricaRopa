package com.prueba.fabrica.ropa.entidades;

/**
 * Entidad que representa los tipos de documentos, para usarla en el repositorio.
 * 
 * @author alvaro
 *
 */

public class TipoDocumento {

	private int id;
	private String nombre;
	
	/**
	 * Constructor por defecto
	 * @param id
	 * @param nombre
	 */
	public TipoDocumento() {
		super();
	}
	
	/**
	 * Constructor con todos los parametros.
	 * @param id
	 * @param nombre
	 */
	public TipoDocumento(int id,String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
}
