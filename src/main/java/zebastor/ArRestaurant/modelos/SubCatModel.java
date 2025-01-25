package zebastor.ArRestaurant.modelos;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "categoriatam")
public class SubCatModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tam" , nullable = false )
    private String tam;

    @Column(name = "precio", nullable = false)
    private Integer precio;

    @Column(name = "categoriat_id", nullable = false)
    private Integer categoriat_id;

    public SubCatModel() {
    }

    public SubCatModel(Integer id, String tam, Integer categoriat_id, Integer precio) {
        this.id = id;
        this.tam = tam;
        this.categoriat_id = categoriat_id;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTam() {
        return tam;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getCategoriat_id() {
        return categoriat_id;
    }

    public void setCategoriat_id(Integer categoriat_id) {
        this.categoriat_id = categoriat_id;
    }
}
