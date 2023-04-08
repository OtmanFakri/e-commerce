package Core.DAO;

import Models.Models_CategorieEntity;

import java.util.List;


public interface CategoryDao {
    List<Models_CategorieEntity> readAll();
}
