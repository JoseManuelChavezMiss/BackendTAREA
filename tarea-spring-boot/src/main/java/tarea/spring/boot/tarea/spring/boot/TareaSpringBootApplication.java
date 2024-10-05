package tarea.spring.boot.tarea.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"tarea.spring.boot.tarea.spring.boot"})
public class TareaSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TareaSpringBootApplication.class, args);
	}

}
