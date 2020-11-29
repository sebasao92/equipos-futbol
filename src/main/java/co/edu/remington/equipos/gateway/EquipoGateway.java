package co.edu.remington.equipos.gateway;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import co.edu.remington.equipos.exception.EquipoException;
import co.edu.remington.equipos.model.Equipo;
import co.edu.remington.equipos.model.ListaEquipos;

@Component
public class EquipoGateway {

    private final RestTemplate restTemplate;
    public static final String EQUIPOS_URL = "https://www.thesportsdb.com/api/v1/json/1/search_all_teams.php?s=Soccer&c=Spain";

    public EquipoGateway() {
        this.restTemplate = new RestTemplate();
    }

    public List<Equipo> obtenerEquipos(){

        try {
            ResponseEntity<ListaEquipos> response = restTemplate.getForEntity(EQUIPOS_URL, ListaEquipos.class);
            return response.getBody().getEquipos();
        }catch (HttpStatusCodeException ex){
            throw new EquipoException(
                ex.getStatusCode(), "Error al llamar el servicio de equipos"
            );
        }
    }
}
