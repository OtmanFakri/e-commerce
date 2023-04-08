package Core.Category_DaoImpl;

import Core.DAO.CategoryDao;
import Models.Models_CategorieEntity;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class CategoryDaoimpl {

    @Stateless
    public class Category_Servies  implements CategoryDao {
        @PersistenceContext(unitName = "e-shop")
        private EntityManager entityManager;
        @Override
        public List<Models_CategorieEntity> readAll() {
            TypedQuery<Models_CategorieEntity> query = entityManager.createQuery("SELECT e FROM Categorie e", Models_CategorieEntity.class);
            return query.getResultList();
        }
    }

}
