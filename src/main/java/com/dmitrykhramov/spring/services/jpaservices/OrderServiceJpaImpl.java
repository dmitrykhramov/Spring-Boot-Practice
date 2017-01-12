package com.dmitrykhramov.spring.services.jpaservices;

import com.dmitrykhramov.spring.domain.Order;
import com.dmitrykhramov.spring.services.OrderService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by Dmitry on 09.01.2017.
 */

@Service
@Profile("jpadao")
public class OrderServiceJpaImpl extends AbstractJpaService implements OrderService {

    @Override
    public List<Order> listAll() {
        EntityManager em = emf.createEntityManager();

        return em.createQuery("from Order", Order.class).getResultList();
    }

    @Override
    public Order getById(Integer id) {
        EntityManager em = emf.createEntityManager();

        return em.find(Order.class, id);
    }

    @Override
    public Order saveOrUpdate(Order domainObject) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Order savedProduct = em.merge(domainObject);
        em.getTransaction().commit();

        return savedProduct;
    }

    @Override
    public void delete(Integer id) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.remove(em.find(Order.class, id));
        em.getTransaction().commit();
    }

}
