package com.itexperts.projeto.service;

import com.itexperts.projeto.model.CardType;
import com.itexperts.projeto.repository.CardTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CardTypeService {

    @Autowired
    private CardTypeRepository cardTypeRepository;

    @Transactional
    public CardType create(CardType cardType) {
        return cardTypeRepository.save(cardType);
    }

    @Transactional
    public List<CardType> getAll() {
        return cardTypeRepository.findAll();
    }

}
