package photos.brooklyn.shoppinglist.utils;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

/**
 * not used currently; just a placeholder for more interesting exception handling
 */
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleAnyThrowable(WebRequest req, Exception e) {
        final Map<String, ? super Object> resMap = new HashMap<>();
        resMap.put("error", e.getMessage());
        resMap.put("success", false);
        return handleExceptionInternal(e, resMap, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, req);
    }
}
