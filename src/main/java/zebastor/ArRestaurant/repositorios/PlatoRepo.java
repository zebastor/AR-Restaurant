package zebastor.ArRestaurant.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import zebastor.ArRestaurant.modelos.PlatoModel;

import java.util.List;

public interface PlatoRepo extends JpaRepository<PlatoModel, Integer> {


    @Query("SELECT p.id, p.nombre, p.ingredientes, p.fotoar, c.tam, c.precio, cat.nombre AS categoria " +
            "FROM PlatoModel p " +
            "INNER JOIN SubCatModel c ON p.categoriatam_id = c.id "+
            "INNER JOIN CategoriapPlatoModel cat ON c.categoriat_id = cat.id"

    )
    List<Object[]> obtenerPlatosConCategoria();
}
