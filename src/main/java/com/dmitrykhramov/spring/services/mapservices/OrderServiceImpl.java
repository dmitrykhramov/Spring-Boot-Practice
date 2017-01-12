package com.dmitrykhramov.spring.services.mapservices;

import com.dmitrykhramov.spring.domain.DomainObject;
import com.dmitrykhramov.spring.domain.Order;
import com.dmitrykhramov.spring.services.OrderService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dmitry on 09.01.2017.
 */

@Service
@Profile("map")
public class OrderServiceImpl extends AbstractMapService implements OrderService {
    @Override
    public List<DomainObject> listAll() {
        return super.listAll();
    }

    @Override
    public Order getById(Integer id) {
        return (Order) super.getById(id);
    }

    @Override
    public Order saveOrUpdate(Order domainObject) {
        return (Order) super.saveOrUpdate(domainObject);
    }

    @Override
    public void delete(Integer id) {
        super.delete(id);
    }
}
