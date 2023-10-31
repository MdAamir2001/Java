package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entities.BankAccount;

import java.util.List;

@Component
public class SpringBankAssignmentApplication implements CommandLineRunner {

    @Autowired
    private BankAccountService bankAccountService;

    @Override
    public void run(String... args) throws Exception {
        // Create some sample accounts
        BankAccount account1 = new BankAccount(null, null, null, 0);
        account1.setAccountNumber("12345");
        account1.setAccountHolder("John Doe");
        account1.setBalance(1000);

        BankAccount account2 = new BankAccount(null, null, null, 0);
        account2.setAccountNumber("67890");
        account2.setAccountHolder("Jane Doe");
        account2.setBalance(2000);

        bankAccountService.createAccount(account1);
        bankAccountService.createAccount(account2);
        

        // Display all accounts
        List<BankAccount> accounts = bankAccountService.getAllAccounts();
        for (BankAccount account : accounts) {
            System.out.println(account.getAccountHolder() + " - " + account.getAccountNumber() + " - $" + account.getBalance());
        }

        // Get account by ID
        BankAccount account = bankAccountService.getAccountById(1L);
        if (account != null) {
            System.out.println("Account found: " + account.getAccountHolder() + " - " + account.getAccountNumber() + " - $" + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
}
