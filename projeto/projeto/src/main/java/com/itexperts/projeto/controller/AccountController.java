package com.itexperts.projeto.controller;

import com.itexperts.projeto.model.Account;
import com.itexperts.projeto.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @GetMapping
    @ResponseStatus(value = HttpStatus.OK)
    public List<Account> listAccounts() {
        return accountRepository.findAll();
    }

//    @GetMapping
//    public String listAccounts() {
//        return "Hello World";
//    }

    @GetMapping("/{id}")
    public String getAccountById(@PathVariable Integer id) {
        return "Hello World by id: " + id;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public Account createAccount(@RequestBody Account account) {
        return accountRepository.save(account);
    }

}
