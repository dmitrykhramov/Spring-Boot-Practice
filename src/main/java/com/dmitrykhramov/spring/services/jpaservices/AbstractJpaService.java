package com.dmitrykhramov.spring.services.jpaservices;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

/**
 * Created by Dmitry on 09.01.2017.
 */

public class AbstractJpaService {

    protected EntityManagerFactory emf;

    @PersistenceUnit
    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }
}
