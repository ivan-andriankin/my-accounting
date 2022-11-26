package com.example.myaccounting.service;

import com.example.myaccounting.model.AccountBalance;
import com.example.myaccounting.repository.AccountBalanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AccountBalanceService {

    private AccountBalanceRepository accountBalanceRepository;

    public AccountBalanceService(AccountBalanceRepository accountBalanceRepository) {
        this.accountBalanceRepository = accountBalanceRepository;
    }

    public List<AccountBalance> getAllAccountBalances() {
        return (List<AccountBalance>) accountBalanceRepository.findAll();
    }

    public Optional<AccountBalance> getAccountBalanceById(Long accountId) {
        return accountBalanceRepository.findById(accountId);
    }

    public AccountBalance saveAccountBalance(AccountBalance accountBalance) {
        accountBalanceRepository.save(accountBalance);
        return accountBalance;
    }

    public AccountBalance updateAccountBalance(AccountBalance accountBalance) {
        accountBalanceRepository.save(accountBalance);
        return accountBalance;
    }

    public AccountBalance deleteAccountBalance(AccountBalance accountBalance) {
        accountBalanceRepository.delete(accountBalance);
        return accountBalance;
    }

}
