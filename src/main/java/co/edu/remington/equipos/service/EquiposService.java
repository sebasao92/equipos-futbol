package co.edu.remington.equipos.service;

import org.springframework.stereotype.Service;

import java.util.List;

import co.edu.remington.equipos.gateway.EquipoGateway;
import co.edu.remington.equipos.model.Equipo;

@Service
public class EquiposService {

    private final EquipoGateway equipoGateway;

    public EquiposService(EquipoGateway equipoGateway) {
        this.equipoGateway = equipoGateway;
    }

    public List<Equipo> obtenerEquipos(){

        return equipoGateway.obtenerEquipos();
    }
}
