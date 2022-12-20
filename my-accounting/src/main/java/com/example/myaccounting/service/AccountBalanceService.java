package com.example.myaccounting.service;

import com.example.myaccounting.model.AccountBalance;
import com.example.myaccounting.repository.AccountBalanceCRUDRepository;
import com.example.myaccounting.repository.AccountBalanceJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AccountBalanceService {
    private AccountBalanceCRUDRepository accountBalanceCRUDRepository;

    public AccountBalanceService(AccountBalanceCRUDRepository accountBalanceCRUDRepository) {
        this.accountBalanceCRUDRepository = accountBalanceCRUDRepository;
    }

    public List<AccountBalance> getAllAccountBalances() {
        return (List<AccountBalance>) accountBalanceCRUDRepository.findAll();
    }

    public AccountBalance getAccountBalanceById(Long accountId) {
        return accountBalanceCRUDRepository.findById(accountId).get();
    }

    public AccountBalance saveAccountBalance(AccountBalance accountBalance) {
        accountBalanceCRUDRepository.save(accountBalance);
        return accountBalance;
    }

    public AccountBalance updateAccountBalance(AccountBalance accountBalance) {
        accountBalanceCRUDRepository.save(accountBalance);
        return accountBalance;
    }

    public AccountBalance deleteAccountBalance(AccountBalance accountBalance) {
        accountBalanceCRUDRepository.delete(accountBalance);
        return accountBalance;
    }

    // JPA:
    @Autowired
    private AccountBalanceJPARepository accountBalanceJPARepository;

    public double getAccountsSum() {
        return accountBalanceJPARepository.getAccountsSum();
    }

}
