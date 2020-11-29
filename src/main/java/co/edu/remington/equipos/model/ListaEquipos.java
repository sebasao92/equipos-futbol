package co.edu.remington.equipos.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collections;
import java.util.List;

import co.edu.remington.equipos.model.Equipo;

public class ListaEquipos {

    @JsonProperty("teams")
    private final List<Equipo> equipos;

    public ListaEquipos(){
        this.equipos = Collections.emptyList();
    }

    public ListaEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }
}
