package com.prueba.fabrica.ropa.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.prueba.fabrica.ropa.entidades.TipoDocumento;
import com.prueba.fabrica.ropa.service.TipoDocumentoService;

/**
 * Esta clase permite exponer los metodos que actuaran como
 * microservicio para realizar las consultas de los diferentes
 * tipos de documentos que hay en nuestra bd.
 * 
 * @author alvaro
 *
 */

@RestController
@RequestMapping("api/fabrica/tipoDocumentos/")
public class ConsultaTipoDocumentoController {

	/**
	 * Servicio para tipos de documentos.
	 */
	
	private final TipoDocumentoService documentoService;
	
	/**
	 * Constructor de la clase que permite la inyeccion de las dependencias.
	 * @param ropaService servicio de tipo documento.
	 */
	@Autowired
	public ConsultaTipoDocumentoController(TipoDocumentoService docService) {
		super();
		this.documentoService = docService;
	}
	
	
	/**
     * Servicio que expone todas los tipos de documentos de la bd
     * 
     * @return Todas los tipos de documentos.
     */
	@CrossOrigin(origins = "*")
	@GetMapping("")
    public List<TipoDocumento> getAll() {
        return documentoService.obtenerTodosLosDocumentos();
    }
            

}
