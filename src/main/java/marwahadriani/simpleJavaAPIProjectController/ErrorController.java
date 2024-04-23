package marwahadriani.simpleJavaAPIProjectController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

import jakarta.validation.ConstraintViolationException;
import marwahadriani.simplejavaAPIProjectModel.ResponseWeb;

@RestControllerAdvice
public class ErrorController {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ResponseWeb<String>> constraintViolationException(ConstraintViolationException exception){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
            .body(ResponseWeb.<String>builder().errors(exception.getMessage()).build());
    }

    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<ResponseWeb<String>> ApiException(ResponseStatusException exception){
        return ResponseEntity.status(exception.getStatusCode())
            .body(ResponseWeb.<String>builder().errors(exception.getReason()).build());
    }
}
