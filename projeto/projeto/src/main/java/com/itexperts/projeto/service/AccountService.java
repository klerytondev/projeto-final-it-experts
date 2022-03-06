package com.itexperts.projeto.service;

import com.itexperts.projeto.model.Account;
import com.itexperts.projeto.model.Card;
import com.itexperts.projeto.repository.AccountRepository;
import com.itexperts.projeto.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private CardRepository cardRepository;

    @Transactional
    public Account create(Account account) {
        persistCardEntity(account);
        return accountRepository.save(account);
    }

    //TODO exception se nao tiver nenhum card sendo passado
    //TODO exception se tiver um card igual ja cadastrado
    private void persistCardEntity(Account account) {
        List<Card> cards = account.getCards();
        for (Card card : cards) {
            card.setAccount(account);
            cardRepository.save(card);
        }
    }

}
