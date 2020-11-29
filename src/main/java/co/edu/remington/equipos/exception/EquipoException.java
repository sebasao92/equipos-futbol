package co.edu.remington.equipos.exception;

import org.springframework.http.HttpStatus;

public class EquipoException extends RuntimeException {

    private final HttpStatus status;
    private final String errorMessage;

    public EquipoException(HttpStatus status, String errorMessage) {
        this.status = status;
        this.errorMessage = errorMessage;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
