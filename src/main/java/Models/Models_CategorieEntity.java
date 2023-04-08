package Models;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Categorie", schema = "e-shop", catalog = "")
public class Models_CategorieEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic
    @Column(name = "name", nullable = false)
    private Long name;
    @Basic
    @Column(name = "image", nullable = false)
    private Long image;
    @OneToMany(mappedBy = "categorieByCategoriId")
    private Collection<Models_PlancEntity> plancsById;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getName() {
        return name;
    }

    public void setName(Long name) {
        this.name = name;
    }

    public Long getImage() {
        return image;
    }

    public void setImage(Long image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Models_CategorieEntity that = (Models_CategorieEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, image);
    }

    public Collection<Models_PlancEntity> getPlancsById() {
        return plancsById;
    }

    public void setPlancsById(Collection<Models_PlancEntity> plancsById) {
        this.plancsById = plancsById;
    }
}
