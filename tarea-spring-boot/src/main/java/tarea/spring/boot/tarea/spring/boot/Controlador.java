package tarea.spring.boot.tarea.spring.boot;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class Controlador {

    @GetMapping("/greet")
    public String greet() {
        return "Hello from Spring Boot!";
    }

}
