package Models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Main_ouver", schema = "e-shop", catalog = "")
public class Models_MainOuverEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic
    @Column(name = "Prix", nullable = false, precision = 2)
    private Double prix;
    @Basic
    @Column(name = "ID_Matr", nullable = false)
    private Long idMatr;
    @Basic
    @Column(name = "ID_Group", nullable = false)
    private Long idGroup;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Long getIdMatr() {
        return idMatr;
    }

    public void setIdMatr(Long idMatr) {
        this.idMatr = idMatr;
    }

    public Long getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Long idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Models_MainOuverEntity that = (Models_MainOuverEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(prix, that.prix) && Objects.equals(idMatr, that.idMatr) && Objects.equals(idGroup, that.idGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, prix, idMatr, idGroup);
    }
}
