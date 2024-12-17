package com.app.wellbeingapp.repository;

import com.app.wellbeingapp.model.User;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class UserRepository extends SimpleJpaRepository<User, String> {
    private final EntityManager em;
    public UserRepository(EntityManager em) {
        super(User.class, em);
        this.em = em;
    }
    @Override
    public List<User> findAll() {
        return em.createNativeQuery("Select * from \"wellbeingapp_492\".\"User\"", User.class).getResultList();
    }
}