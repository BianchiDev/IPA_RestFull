package br.com.bianchi.ipa.controller.exceptions;

import java.time.LocalDateTime;

import org.hibernate.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.bianchi.ipa.services.exceptions.ObjectNotFoundExcepions;
import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ReasourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundExcepions.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException ex, HttpServletRequest request) {
        StandardError error = new StandardError(LocalDateTime.now(), HttpStatus.NOT_FOUND.value(), ex.getMessage(),
                request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

}
