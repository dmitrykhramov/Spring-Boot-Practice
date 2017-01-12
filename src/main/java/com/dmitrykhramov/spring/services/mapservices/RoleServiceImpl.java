package com.dmitrykhramov.spring.services.mapservices;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Dmitry on 09.01.2017.
 */

@Service
@Profile("map")
public class RoleServiceImpl extends AbstractMapService {
}
