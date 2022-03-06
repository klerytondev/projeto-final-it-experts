package com.itexperts.projeto.repository;

import com.itexperts.projeto.model.CardType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CardTypeRepository extends JpaRepository<CardType, Integer> {

    Optional<CardType> findByName(String name);
}
