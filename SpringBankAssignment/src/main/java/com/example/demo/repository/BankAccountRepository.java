package com.example.demo.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.BankAccount;
public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
	    List<BankAccount> findByAccountHolder(String accountHolder);
	    List<BankAccount> findByBalanceGreaterThan(double balance);
	}
	
