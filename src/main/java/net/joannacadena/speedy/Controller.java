package net.joannacadena.speedy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("speed")
public class Controller {

    @GetMapping("/greeting/{name}")
    public ResponseEntity<String> greeting(@PathVariable String name){

        return ResponseEntity.ok("Hello "+name);
    }
}
