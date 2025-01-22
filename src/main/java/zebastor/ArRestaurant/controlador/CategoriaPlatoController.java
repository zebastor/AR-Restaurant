package zebastor.ArRestaurant.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zebastor.ArRestaurant.modelos.CategoriapPlatoModel;
import zebastor.ArRestaurant.repositorios.CategoriaPlatoRepo;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class CategoriaPlatoController {

    @Autowired
    private CategoriaPlatoRepo CategoriaPlatoRepo;

    @GetMapping("/Categoria_plato")
    public List<CategoriapPlatoModel> listAll(){return CategoriaPlatoRepo.findAll();}
}
