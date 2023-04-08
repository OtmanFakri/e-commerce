package Servies;


import Core.DAO.CategoryDao;
import Models.Models_CategorieEntity;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;


public class Category_Servies  {

    public void getAllEmployees() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("eshop");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query query = entityManager.createQuery("SELECT u FROM Categorie u");
            List<Models_CategorieEntity> resultList = query.getResultList();
            for (Models_CategorieEntity user : resultList) {
                System.out.println(user); // Or do anything you like with the User object
            }
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.out.println(e);
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
