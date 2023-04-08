package Models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Order", schema = "e-shop", catalog = "")
public class Models_OrderEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic
    @Column(name = "Planc_ID", nullable = false)
    private Long plancId;
    @Basic
    @Column(name = "Date", nullable = false)
    private Long date;
    @Basic
    @Column(name = "Pric", nullable = false)
    private Long pric;
    @Basic
    @Column(name = "ID_manOuver", nullable = false)
    private Long idManOuver;
    @ManyToOne
    @JoinColumn(name = "ID_manOuver", referencedColumnName = "ID", nullable = false)
    private Models_MainOuverEntity mainOuverByIdManOuver;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlancId() {
        return plancId;
    }

    public void setPlancId(Long plancId) {
        this.plancId = plancId;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public Long getPric() {
        return pric;
    }

    public void setPric(Long pric) {
        this.pric = pric;
    }

    public Long getIdManOuver() {
        return idManOuver;
    }

    public void setIdManOuver(Long idManOuver) {
        this.idManOuver = idManOuver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Models_OrderEntity that = (Models_OrderEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(plancId, that.plancId) && Objects.equals(date, that.date) && Objects.equals(pric, that.pric) && Objects.equals(idManOuver, that.idManOuver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, plancId, date, pric, idManOuver);
    }

    public Models_MainOuverEntity getMainOuverByIdManOuver() {
        return mainOuverByIdManOuver;
    }

    public void setMainOuverByIdManOuver(Models_MainOuverEntity mainOuverByIdManOuver) {
        this.mainOuverByIdManOuver = mainOuverByIdManOuver;
    }
}
