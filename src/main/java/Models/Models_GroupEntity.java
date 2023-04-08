package Models;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Group", schema = "e-shop", catalog = "")
public class Models_GroupEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic
    @Column(name = "Name", nullable = false)
    private Long name;
    @Basic
    @Column(name = "ID_Emploiyes", nullable = false)
    private Long idEmploiyes;
    @ManyToOne
    @JoinColumn(name = "ID_Emploiyes", referencedColumnName = "id", nullable = false)
    private Models_EmploiyesEntity emploiyesByIdEmploiyes;
    @OneToMany(mappedBy = "groupByIdGroup")
    private Collection<Models_MainOuverEntity> mainOuversById;

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

    public Long getIdEmploiyes() {
        return idEmploiyes;
    }

    public void setIdEmploiyes(Long idEmploiyes) {
        this.idEmploiyes = idEmploiyes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Models_GroupEntity that = (Models_GroupEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(idEmploiyes, that.idEmploiyes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, idEmploiyes);
    }

    public Models_EmploiyesEntity getEmploiyesByIdEmploiyes() {
        return emploiyesByIdEmploiyes;
    }

    public void setEmploiyesByIdEmploiyes(Models_EmploiyesEntity emploiyesByIdEmploiyes) {
        this.emploiyesByIdEmploiyes = emploiyesByIdEmploiyes;
    }

    public Collection<Models_MainOuverEntity> getMainOuversById() {
        return mainOuversById;
    }

    public void setMainOuversById(Collection<Models_MainOuverEntity> mainOuversById) {
        this.mainOuversById = mainOuversById;
    }
}
