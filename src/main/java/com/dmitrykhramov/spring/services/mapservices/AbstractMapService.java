package com.dmitrykhramov.spring.services.mapservices;

import com.dmitrykhramov.spring.domain.DomainObject;
import com.dmitrykhramov.spring.domain.Product;

import java.util.*;

/**
 * Created by Dmitry on 29.12.2016.
 */
public abstract class AbstractMapService {

    protected Map<Integer, DomainObject> domainMap;

    public AbstractMapService() {
        this.domainMap = new HashMap<>();
    }

    public List<DomainObject> listAll() {
        return new ArrayList<>(domainMap.values());
    }

    public DomainObject getById(Integer id) {
        return domainMap.get(id);
    }

    public DomainObject saveOrUpdate(DomainObject domainObject) {
        if (domainObject != null) {
            if (domainObject.getId() == null) {
                domainObject.setId(getNextKey());
            }
            domainMap.put(domainObject.getId(), domainObject);
            return domainObject;
        } else {
            throw new RuntimeException("Object can't be null");
        }
    }

    public void delete(Integer id) {
        domainMap.remove(id);
    }

    private Integer getNextKey(){
        return Collections.max(domainMap.keySet()) + 1;
    }

}
