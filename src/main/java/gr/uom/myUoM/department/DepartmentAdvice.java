package gr.uom.myUoM.department;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class DepartmentAdvice {

    @ExceptionHandler()
    public ResponseEntity<Map<String,String>> depNotFound(Exception exception){
        HashMap<String, String> errorMap = new HashMap<>();
        errorMap.put("error",exception.getMessage());
        return new ResponseEntity<>(errorMap, HttpStatus.NOT_FOUND);
    }
}
