package zebastor.ArRestaurant.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zebastor.ArRestaurant.modelos.CategoriapPlatoModel;
import zebastor.ArRestaurant.modelos.PlatoModel;
import zebastor.ArRestaurant.modelos.SubCatModel;
import zebastor.ArRestaurant.repositorios.CategoriaPlatoRepo;
import zebastor.ArRestaurant.repositorios.PlatoRepo;
import zebastor.ArRestaurant.repositorios.SubCatRepo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/")
//@CrossOrigin(origins =  "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class CategoriaPlatoController {

    @Autowired
    private CategoriaPlatoRepo CategoriaPlatoRepo;
    @Autowired
    private PlatoRepo platoRepo;


    @GetMapping("/Categoria_plato")
    public List<CategoriapPlatoModel> listAll(){return CategoriaPlatoRepo.findAll();}

    @GetMapping("/list-all")
    public List<Map<String, Object>> listarPlatosConCategoria() {
        List<Object[]> resultados = platoRepo.obtenerPlatosConCategoria();

        return resultados.stream().map(fila -> {
            Map<String, Object> mapa = new HashMap<>();
            mapa.put("id", fila[0]);
            mapa.put("nombre", fila[1]);
            mapa.put("ingredientes", fila[2]);
            mapa.put("fotoar", fila[3]);
            mapa.put("tam", fila[4]);
            mapa.put("precio", fila[5]);
            mapa.put("categoria", fila[6]);
            return mapa;
        }).collect(Collectors.toList());
    }
}
