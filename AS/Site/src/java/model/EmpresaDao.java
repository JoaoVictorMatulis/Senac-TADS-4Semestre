package model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.RollbackException;
import javax.persistence.TypedQuery;

public class EmpresaDao {
    private EntityManager manager;
    
    private void conectar(){
        manager = Persistence.createEntityManagerFactory("SitePU").createEntityManager();
    }
    
    public Usuario validarLogin(String u, String s){
        conectar();
        try{            
            TypedQuery<Usuario> query = manager.createNamedQuery("Usuario.findByEmailSenha", Usuario.class);
            query.setParameter("emailFun", u);
            query.setParameter("senhaUsu", s);
            return query.getSingleResult();
        } catch(NoResultException x){
            return null;
        }   
    }
    
    public <T> int cadastrar(T obj){
        conectar();
        try{
            manager.getTransaction().begin();
            manager.persist(obj);
            manager.getTransaction().commit();
            return 1;
        }   catch (RollbackException erro){ 
            //duplicação de Chave Primaria
            return 2;
        }   catch(Exception erro){
            return 0;
        }
    }
    
    public List listarDepartamentos(){
        conectar();
        try{
            return manager.createNamedQuery("Departamento.findAll", Departamento.class).getResultList();
        } catch(NoResultException erro){
            return null;
        }
    }
}
