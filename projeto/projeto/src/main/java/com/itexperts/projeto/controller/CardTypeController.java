package com.itexperts.projeto.controller;

import com.itexperts.projeto.model.TypeCard;
import com.itexperts.projeto.service.TypeCardService;
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
public class TypeCardController {

    @Autowired
    private TypeCardService typeCardService;

    @PostMapping
    public ResponseEntity<TypeCard> create(TypeCard typeCard) {
        TypeCard typeCardReturned = typeCardService.create(typeCard);
        return ResponseEntity.status(HttpStatus.CREATED).body(typeCardReturned);
    }

    @GetMapping
    public ResponseEntity<List<TypeCard>> getAll() {
        List<TypeCard> typeCardsReturned = typeCardService.getAll();
        return ResponseEntity.ok().body(typeCardsReturned);
    }

}
