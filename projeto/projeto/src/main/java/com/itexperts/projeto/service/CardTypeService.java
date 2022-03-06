package com.itexperts.projeto.service;

import com.itexperts.projeto.model.TypeCard;
import com.itexperts.projeto.repository.TypeCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TypeCardService {

    @Autowired
    private TypeCardRepository typeCardRepository;

    @Transactional
    public TypeCard create(TypeCard typeCard) {
        return typeCardRepository.save(typeCard);
    }

    @Transactional
    public List<TypeCard> getAll() {
        return typeCardRepository.findAll();
    }

}
