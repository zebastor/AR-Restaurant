package zebastor.ArRestaurant.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "categoriaplato")
public class CategoriapPlatoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcategoria;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    public CategoriapPlatoModel() {
    }

    public CategoriapPlatoModel(Integer idcategoria, String nombre) {
        this.idcategoria = idcategoria;
        this.nombre = nombre;
    }

    public Integer getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(Integer idCategoria) {
        this.idcategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
