package Models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Matiaux", schema = "e-shop", catalog = "")
public class Models_MatiauxEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic
    @Column(name = "prix m²", nullable = false, precision = 2)
    private Double prixM;
    @Basic
    @Column(name = "Quntite", nullable = false, precision = 2)
    private Double quntite;
    @Basic
    @Column(name = "ID_Planc", nullable = false)
    private Long idPlanc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrixM() {
        return prixM;
    }

    public void setPrixM(Double prixM) {
        this.prixM = prixM;
    }

    public Double getQuntite() {
        return quntite;
    }

    public void setQuntite(Double quntite) {
        this.quntite = quntite;
    }

    public Long getIdPlanc() {
        return idPlanc;
    }

    public void setIdPlanc(Long idPlanc) {
        this.idPlanc = idPlanc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Models_MatiauxEntity that = (Models_MatiauxEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(prixM, that.prixM) && Objects.equals(quntite, that.quntite) && Objects.equals(idPlanc, that.idPlanc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, prixM, quntite, idPlanc);
    }
}
