package com.itexperts.projeto.controller;

import com.itexperts.projeto.model.CardType;
import com.itexperts.projeto.service.CardTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/card_types")
public class CardTypeController {

    @Autowired
    private CardTypeService cardTypeService;

    @PostMapping
    public ResponseEntity<CardType> create(CardType cardType) {
        CardType cardTypeReturned = cardTypeService.create(cardType);
        return ResponseEntity.status(HttpStatus.CREATED).body(cardTypeReturned);
    }

    @GetMapping
    public ResponseEntity<List<CardType>> getAll() {
        List<CardType> cardTypesReturned = cardTypeService.getAll();
        return ResponseEntity.ok().body(cardTypesReturned);
    }

}
