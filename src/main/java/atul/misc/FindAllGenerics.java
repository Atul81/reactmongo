package atul.misc;

import atul.model.Response;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.logging.Logger;


public class FindAllGenerics<T> {

    private static final Logger allGenericLog = Logger.getLogger("FindAllGenerics");

    public ResponseEntity<Response<T>> findAllResponseEntity(T dataBaseObject) {
        Response<T> allDBObjects = new Response<>();
        allDBObjects.setResponse(dataBaseObject);
        allDBObjects.setHeaderModel(new Const().headerModel());
        return new ResponseEntity<>(allDBObjects, HttpStatus.OK);
    }

    public String getObjectPrinting(Object inp) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper(); // for Object printing to String
        return mapper.writeValueAsString(inp);
    }
}
