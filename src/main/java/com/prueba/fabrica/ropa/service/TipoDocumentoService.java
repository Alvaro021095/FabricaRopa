package com.prueba.fabrica.ropa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.fabrica.ropa.entidades.TipoDocumento;
import com.prueba.fabrica.ropa.repositorio.TipoDocumentoRepositorio;

/**
 * Servicio que permite realizar las operaciones necesarias 
 * sobre la entidad de servicio y exponerlo al controlador.
 * 
 * @author alvaro
 *
 */

@Service
public class TipoDocumentoService {

	
	/**
	 * Clase que permite el acceso a base de datos
	 */
	private final TipoDocumentoRepositorio documentoRepositorio;
	
	/**
	 * Constructor que permite inyectar las dependencias.
	 * @param documentoRepositorio
	 */
	@Autowired
	public TipoDocumentoService(TipoDocumentoRepositorio docRepositorio){
		this.documentoRepositorio = docRepositorio;
	}
	
	/**
	 * Metodo que nos permite obtener los tipos de documentos que hay en la bd.
	 * @return Lista con los tipos de documentos que hay en la fabrica.
	 */
	public List<TipoDocumento> obtenerTodosLosDocumentos() {
		return documentoRepositorio.obtenerTipoDocumento();
	}
}
