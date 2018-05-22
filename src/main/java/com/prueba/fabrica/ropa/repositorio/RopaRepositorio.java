package com.prueba.fabrica.ropa.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.prueba.fabrica.ropa.FabricaConfig;
import com.prueba.fabrica.ropa.entidades.Ropa;


/**
 * Clase que permite manejar la data en la base de datos.
 * 
 * @author alvaro
 *
 */
@Repository
public class RopaRepositorio {
	
	/**
     * Logger que permite mostrar en consola los mensjaes definidos.
     */
    private final Logger logger = LoggerFactory.getLogger(RopaRepositorio.class);
	
	/**
	 * Bean para realizar las operaciones sobre bd
	 * configurado en {@link FabricaConfig}
	 */
	private final JdbcTemplate jdbcTemplate;
	
	private static final String QUERY_ROPA = "select id, nombre, precio from tiporopa"; 
	
	/**
	 * Constructor que permite inyectar las dependencias.
	 * @param jdbcTemplate
	 */
	@Autowired
	public RopaRepositorio(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	/**
	 * Metodo que permite obtener toda la ropa en bd.
	 * @return List con toda la ropa en bd
	 */
	public List<Ropa> obtenerRopa() {
		
		logger.info("Ejecutando el query para buscar ropa....");
		
        return jdbcTemplate.query(QUERY_ROPA, new BeanPropertyRowMapper<>(Ropa.class));
	}

}
