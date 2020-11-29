package co.edu.remington.equipos.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EquipoErrorHandler {

    @ExceptionHandler(EquipoException.class)
    public ResponseEntity<ErrorResponse> handleEquipoException(EquipoException ex) {

        return ResponseEntity
                .status(ex.getStatus())
                .body(
                        new ErrorResponse(ex.getErrorMessage())
                );
    }
}
