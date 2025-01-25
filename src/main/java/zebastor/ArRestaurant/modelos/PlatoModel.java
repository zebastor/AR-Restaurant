package zebastor.ArRestaurant.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "plato")
public class PlatoModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

@Column(name = "nombre", nullable = false)
    private String nombre;

@Column(name = "ingredientes", nullable = false)
    private String ingredientes;

@Column(name = "fotoar", nullable = false)
    private String fotoar;
@Column(name = "categoriatam_id", nullable = false)
    private Integer categoriatam_id;

    public PlatoModel() {}

    public PlatoModel(Integer id, String nombre, String fotoar, String ingredientes, Integer categoriatam_id) {
        this.id = id;
        this.nombre = nombre;
        this.fotoar = fotoar;
        this.ingredientes = ingredientes;
        this.categoriatam_id = categoriatam_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getFotoar() {
        return fotoar;
    }

    public void setFotoar(String fotoar) {
        this.fotoar = fotoar;
    }

    public Integer getCategoriatam_id() {
        return categoriatam_id;
    }

    public void setCategoriatam_id(Integer categoriatam_id) {
        this.categoriatam_id = categoriatam_id;
    }
}
