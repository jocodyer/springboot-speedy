package net.joannacadena.speedy;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;



@RestController
@RequestMapping("speed")
public class Controller {

    @GetMapping("/greeting/{name}")
    public ResponseEntity<String> greeting(@PathVariable String name){

        return ResponseEntity.ok("Hello "+name);
    }
    @GetMapping("/fail/{name}")
    public ResponseEntity<String> fail(@PathVariable String name){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"You have not been found"+name);
    }
}
