package co.edu.remington.equipos.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Equipo {

    @JsonProperty("strTeam")
    private final String nombre;

    @JsonProperty("strDescriptionEN")
    private final String descripcion;

    public Equipo(){
        this.nombre = "";
        this.descripcion = "";
    }

    public Equipo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
