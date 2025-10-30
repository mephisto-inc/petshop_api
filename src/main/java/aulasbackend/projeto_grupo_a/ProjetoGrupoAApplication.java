package aulasbackend.projeto_grupo_a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjetoGrupoAApplication {

    static void main(String[] args) {
        SpringApplication.run(ProjetoGrupoAApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Hello Docker World";
    }

    // HELLO WORLD
}
