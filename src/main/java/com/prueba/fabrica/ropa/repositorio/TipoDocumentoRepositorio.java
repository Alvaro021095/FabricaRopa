package com.prueba.fabrica.ropa.repositorio;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.prueba.fabrica.ropa.FabricaConfig;
import com.prueba.fabrica.ropa.entidades.TipoDocumento;

/**
 * Clase que permite manejar la data en la base de datos.
 * 
 * @author alvaro
 *
 */

@Repository
public class TipoDocumentoRepositorio {

	/**
     * Logger que permite mostrar en consola los mensjaes definidos.
     */
    private final Logger logger = LoggerFactory.getLogger(TipoDocumentoRepositorio.class);
    
    /**
	 * Bean para realizar las operaciones sobre bd
	 * configurado en {@link FabricaConfig}
	 */
	private final JdbcTemplate jdbcTemplate;
	
	private static final String QUERY_TIPO_DOCUMENTOS
	= "select id, nombre from tipodocumento"; 
	
	
	/**
	 * Constructor que permite inyectar las dependencias.
	 * @param jdbcTemplate
	 */
	@Autowired
	public TipoDocumentoRepositorio(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	/**
	 * Metodo que permite obtener todos los tipos de documentos de bd.
	 * @return List con toda los tipos de documento en bd
	 */
	public List<TipoDocumento> obtenerTipoDocumento() {
		
		logger.info("Ejecutando el query para buscar ropa....");
		
        return jdbcTemplate.query(QUERY_TIPO_DOCUMENTOS, new BeanPropertyRowMapper<>(TipoDocumento.class));
	}
}
