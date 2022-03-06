package com.itexperts.projeto.controller;

import com.itexperts.projeto.model.Account;
import com.itexperts.projeto.repository.AccountRepository;
import com.itexperts.projeto.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private AccountRepository accountRepository;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<Account> createAccount(@RequestBody Account account) {
        Account accountReturned = accountService.create(account);
        return ResponseEntity.status(HttpStatus.CREATED).body(accountReturned);
    }

    //TODO tirar chamada direta do repository da controller e chamar service de account
    @GetMapping("/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public Optional<Account> getOneAccountById(@PathVariable Integer id) {
        System.out.println("Pegando uma única conta por id");
        return accountRepository.findById(id);
    }

    @GetMapping
    @ResponseStatus(value = HttpStatus.OK)
    public List<Account> listAllAccounts() {
        System.out.println("Listando todas as contas");
        return accountRepository.findAll();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteOneAccountById(@PathVariable Integer id) {
        System.out.println("Deletando uma única conta por id");
        accountRepository.deleteById(id);
    }

    //TODO criar método de update



}
