package br.com.dao;
  
import java.util.List;
  


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Service;

import br.com.model.User;
 
@Service
public class UserDAO {
  
         private static UserDAO instance;
         protected EntityManager entityManager;
          
         public static UserDAO getInstance(){
                   if (instance == null){
                            instance = new UserDAO();
                   }
                    
                   return instance;
         }
  
         private UserDAO() {
                   entityManager = getEntityManager();
         }
  
         private EntityManager getEntityManager() {
                   EntityManagerFactory factory = Persistence.createEntityManagerFactory("crudHibernatePU");
                   if (entityManager == null) {
                            entityManager = factory.createEntityManager();
                   }
  
                   return entityManager;
         }
  
         public User getById(final int id) {
                   return entityManager.find(User.class, id);
         }
  
         @SuppressWarnings("unchecked")
         public List<User> findAll() {
                   return entityManager.createQuery("FROM " + User.class.getName()).getResultList();
         }
  
         public String persist(User cliente) {
                   try {
                            entityManager.getTransaction().begin();
                            entityManager.persist(cliente);
                            entityManager.getTransaction().commit();
			    // Teste para o envio para o git hub
                            return "true";
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();
                            return "false";                            
                   }
                   
         }
  
         public String merge(User cliente) {
                   try {
                            entityManager.getTransaction().begin();
                            entityManager.merge(cliente);
                            entityManager.getTransaction().commit();
                            return "true";
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();

                            return "false";
                   }
         }
  
         public void remove(User cliente) {
                   try {
                            entityManager.getTransaction().begin();
                            cliente = entityManager.find(User.class, cliente.getId());
                            entityManager.remove(cliente);
                            entityManager.getTransaction().commit();
                   } catch (Exception ex) {
                            ex.printStackTrace();
                            entityManager.getTransaction().rollback();
                   }
         }
  
         public void removeById(final int id) {
                   try {
                	   User cliente = getById(id);
                            remove(cliente);
                   } catch (Exception ex) {
                            ex.printStackTrace();
                   }
         }
  
}
