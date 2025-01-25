package zebastor.ArRestaurant.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zebastor.ArRestaurant.modelos.CategoriapPlatoModel;

import java.util.List;

@Repository
public interface CategoriaPlatoRepo extends JpaRepository<CategoriapPlatoModel, Integer> {


}
