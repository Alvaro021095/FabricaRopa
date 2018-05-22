package com.prueba.fabrica.ropa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.fabrica.ropa.entidades.Ropa;
import com.prueba.fabrica.ropa.repositorio.RopaRepositorio;

/**
 * Servicio que permite realizar las operaciones necesarias 
 * sobre la entidad de servicio y exponerlo al controlador.
 * 
 * @author alvaro
 *
 */
@Service
public class RopaService {

	/**
	 * Clase que permite el acceso a base de datos
	 */
	private final RopaRepositorio ropaRepositorio;
	
	/**
	 * Constructor que permite inyectar las dependencias.
	 * @param ropaRepositorio
	 */
	@Autowired
	public RopaService(RopaRepositorio ropaRepositorio) {
		this.ropaRepositorio = ropaRepositorio;
	}
	
	/**
	 * Metodo que nos permite obtener las prendas que hay en la fabrica.
	 * @return Lista con las prendas que hay en la fabrica.
	 */
	public List<Ropa> obtenerTodaLaRopa() {
		return ropaRepositorio.obtenerRopa();
	}


}
