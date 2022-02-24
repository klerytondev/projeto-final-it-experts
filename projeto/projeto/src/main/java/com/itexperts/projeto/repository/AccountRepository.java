package com.itexperts.projeto.repository;

import com.itexperts.projeto.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {}
