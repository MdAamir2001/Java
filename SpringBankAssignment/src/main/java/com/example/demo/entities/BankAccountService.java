package com.example.demo.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.BankAccount;
import com.example.demo.repository.BankAccountRepository;

import java.util.List;

@Service
public class BankAccountService {

    @Autowired
    private BankAccountRepository bankAccountRepository;

    public List<BankAccount> getAllAccounts() {
        return bankAccountRepository.findAll();
    }

    public BankAccount getAccountById(Long id) {
        return bankAccountRepository.findById(id).orElse(null);
    }

    public BankAccount createAccount(BankAccount account) {
        return bankAccountRepository.save(account);
    }

    // Additional business logic can be added here
}

