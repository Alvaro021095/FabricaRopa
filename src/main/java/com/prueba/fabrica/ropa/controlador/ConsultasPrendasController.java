package com.prueba.fabrica.ropa.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.fabrica.ropa.entidades.Ropa;
import com.prueba.fabrica.ropa.service.RopaService;

/**
 * Esta clase permite exponer los metodos que actuaran como
 * microservicio para realizar las consultas de las diferentes 
 * prendas de vestir que fabricamos.
 * 
 * @author alvaro
 *
 */
@RestController
@RequestMapping("api/fabrica/prendas/")
public class ConsultasPrendasController {

	/**
	 * Servicio para ropa.
	 */
	private final RopaService ropaService;
	
	/**
	 * Constructor de la clase que permite la inyeccion de las dependencias.
	 * @param ropaService servicio de ropa.
	 */
	@Autowired
	public ConsultasPrendasController(RopaService ropaService) {
		super();
		this.ropaService = ropaService;
	}
	
    /**
     * Servicio que expone todas las prendas del almacen.
     * 
     * @return Todas las prendas del almacen.
     */
	@CrossOrigin(origins = "*")
    @GetMapping("")
    public List<Ropa> getAll() {
        return ropaService.obtenerTodaLaRopa();
    }
}
