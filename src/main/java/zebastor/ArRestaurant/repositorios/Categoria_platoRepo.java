package zebastor.ArRestaurant.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zebastor.ArRestaurant.modelos.Categoria_plato;

@Repository
public interface Categoria_platoRepo extends JpaRepository<Categoria_plato, Integer> {
}
