package com.example.myaccounting.service;

import com.example.myaccounting.model.AccountBalance;
import com.example.myaccounting.repository.AccountBalanceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountBalanceService {
    private AccountBalanceRepository accountBalanceRepository;

    public AccountBalanceService(AccountBalanceRepository accountBalanceRepository) {
        this.accountBalanceRepository = accountBalanceRepository;
    }

    public List<AccountBalance> getAllAccountBalances() {
        return (List<AccountBalance>) accountBalanceRepository.findAll();
    }

    public AccountBalance saveAccountBalance(AccountBalance accountBalance) {
        accountBalanceRepository.save(accountBalance);
        return accountBalance;
    }

    public AccountBalance updateAccountBalance(AccountBalance accountBalance) {
        accountBalanceRepository.findById(accountBalance.getAccountId());
        accountBalanceRepository.save(accountBalance);
        return accountBalance;
    }

    public AccountBalance deleteAccountBalance(AccountBalance accountBalance) {
        accountBalanceRepository.delete(accountBalance);
        return accountBalance;
    }

}
