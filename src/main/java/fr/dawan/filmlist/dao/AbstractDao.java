package fr.dawan.filmlist.dao;

import fr.dawan.filmlist.entities.AbstractEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

import java.io.Serializable;
import java.util.List;

public class AbstractDao<T extends AbstractEntity> implements Serializable {

    private static final long serialVersionUID = 1L;

    protected EntityManager em;

    private Class<T> classEntity;

    public AbstractDao(EntityManager em, Class<T> classEntity) {
        this.em = em;
        this.classEntity = classEntity;
    }
    public void saveOrUpdate(T entity) {
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            if (entity.getId() == 0) {
                em.persist(entity);
            } else {
                em.merge(entity);
            }
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            throw e;
        }
    }

    public void remove(T entity) {
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            em.remove(entity);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            throw e;
        }
    }

    public void remove(long id) {
        remove(findById(id));
        //remove(em.merge(findById(id)));
    }

    public T findById(long id) {
        return em.find(classEntity, id);
    }

    public List<T> findAll() {
        TypedQuery<T> query = em.createQuery("SELECT e FROM " + classEntity.getName() + " e", classEntity);
        return query.getResultList();
    }

}
