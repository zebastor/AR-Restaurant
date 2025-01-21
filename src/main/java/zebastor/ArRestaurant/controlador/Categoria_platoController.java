package zebastor.ArRestaurant.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zebastor.ArRestaurant.modelos.Categoria_plato;
import zebastor.ArRestaurant.repositorios.Categoria_platoRepo;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class Categoria_platoController {

    @Autowired
    private Categoria_platoRepo Categoria_platoRepo;

    @GetMapping("/Categoria_plato")
    public List<Categoria_plato> listAll(){return Categoria_platoRepo.findAll();}
}
