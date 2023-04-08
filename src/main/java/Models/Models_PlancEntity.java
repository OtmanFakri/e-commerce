package Models;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Planc", schema = "e-shop", catalog = "")
public class Models_PlancEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic
    @Column(name = "Name", nullable = false, length = 255)
    private String name;
    @Basic
    @Column(name = "Date_add", nullable = false)
    private Date dateAdd;
    @Basic
    @Column(name = "Date_update", nullable = false)
    private Date dateUpdate;
    @Basic
    @Column(name = "categori-Id", nullable = false)
    private Long categoriId;
    @OneToMany(mappedBy = "plancByIdPlanc")
    private Collection<Models_MatiauxEntity> matiauxesById;
    @OneToOne(mappedBy = "plancById")
    private Models_OrderEntity orderById;
    @ManyToOne
    @JoinColumn(name = "categori-Id", referencedColumnName = "ID", nullable = false)
    private Models_CategorieEntity categorieByCategoriId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(Date dateAdd) {
        this.dateAdd = dateAdd;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public Long getCategoriId() {
        return categoriId;
    }

    public void setCategoriId(Long categoriId) {
        this.categoriId = categoriId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Models_PlancEntity that = (Models_PlancEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(dateAdd, that.dateAdd) && Objects.equals(dateUpdate, that.dateUpdate) && Objects.equals(categoriId, that.categoriId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dateAdd, dateUpdate, categoriId);
    }

    public Collection<Models_MatiauxEntity> getMatiauxesById() {
        return matiauxesById;
    }

    public void setMatiauxesById(Collection<Models_MatiauxEntity> matiauxesById) {
        this.matiauxesById = matiauxesById;
    }

    public Models_OrderEntity getOrderById() {
        return orderById;
    }

    public void setOrderById(Models_OrderEntity orderById) {
        this.orderById = orderById;
    }

    public Models_CategorieEntity getCategorieByCategoriId() {
        return categorieByCategoriId;
    }

    public void setCategorieByCategoriId(Models_CategorieEntity categorieByCategoriId) {
        this.categorieByCategoriId = categorieByCategoriId;
    }
}
