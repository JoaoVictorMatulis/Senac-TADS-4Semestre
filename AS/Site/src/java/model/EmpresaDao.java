package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class EmpresaDao {
    private EntityManagerFactory factory;
    private EntityManager manager;
    
    private void conectar(){
        factory = Persistence.createEntityManagerFactory("SitePU");
        manager = factory.createEntityManager();
    }
    
    public Usuario validarLogin(String u, String s){
        try{
            conectar();
            TypedQuery<Usuario> query = manager.createNamedQuery("Usuario.findByEmailSenha", Usuario.class);
            query.setParameter("emailFun", u);
            query.setParameter("senhaUsu", s);
            return query.getSingleResult();
        } catch(NoResultException x){
            return null;
        }   
    }
    
    public int cadastrarDep(Departamento dep){
        conectar();
        try{
            manager.getTransaction().begin();
            manager.persist(dep);
            manager.getTransaction().commit();
            return 1;
        } catch(Exception erro){
            return 0;
        }
    }
}
