package com.itexperts.projeto.service;

import com.itexperts.projeto.model.Account;
import com.itexperts.projeto.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Transactional
    public Account create(Account account) {
        System.out.println("Criando uma conta");
        return accountRepository.save(account);
    }

}
