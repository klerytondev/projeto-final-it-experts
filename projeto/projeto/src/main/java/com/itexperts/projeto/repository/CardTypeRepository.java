package com.itexperts.projeto.repository;

import com.itexperts.projeto.model.TypeCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeCardRepository extends JpaRepository<TypeCard, Integer> {
}
