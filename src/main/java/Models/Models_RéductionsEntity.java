package Models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "réductions", schema = "e-shop", catalog = "")
public class Models_RéductionsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic
    @Column(name = "réductions%", nullable = false, precision = 2)
    private Double réductions;
    @Basic
    @Column(name = "ID_Planc", nullable = false)
    private Long idPlanc;
    @OneToOne
    @JoinColumn(name = "ID", referencedColumnName = "ID", nullable = false)
    private Models_PlancEntity plancById;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getRéductions() {
        return réductions;
    }

    public void setRéductions(Double réductions) {
        this.réductions = réductions;
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
        Models_RéductionsEntity that = (Models_RéductionsEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(réductions, that.réductions) && Objects.equals(idPlanc, that.idPlanc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, réductions, idPlanc);
    }

    public Models_PlancEntity getPlancById() {
        return plancById;
    }

    public void setPlancById(Models_PlancEntity plancById) {
        this.plancById = plancById;
    }
}
