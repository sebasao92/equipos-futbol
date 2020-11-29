package co.edu.remington.equipos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import co.edu.remington.equipos.model.Equipo;
import co.edu.remington.equipos.service.EquiposService;

@RestController
public class EquipoController {

    private final EquiposService equiposService;

    public EquipoController(EquiposService equiposService) {
        this.equiposService = equiposService;
    }

    @GetMapping("/equipos")
    public ResponseEntity<List<Equipo>> obtenerEquipos(){

        return ResponseEntity.ok(equiposService.obtenerEquipos());
    }
}
