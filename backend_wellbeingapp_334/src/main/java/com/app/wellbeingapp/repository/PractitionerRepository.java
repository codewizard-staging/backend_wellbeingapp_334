package com.app.wellbeingapp.repository;

import com.app.wellbeingapp.model.Practitioner;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class PractitionerRepository extends SimpleJpaRepository<Practitioner, String> {
    private final EntityManager em;
    public PractitionerRepository(EntityManager em) {
        super(Practitioner.class, em);
        this.em = em;
    }
    @Override
    public List<Practitioner> findAll() {
        return em.createNativeQuery("Select * from \"wellbeingapp_492\".\"Practitioner\"", Practitioner.class).getResultList();
    }
}