package com.example.myaccounting.repository;

import com.example.myaccounting.model.AccountBalance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountBalanceJPARepository  extends JpaRepository<AccountBalance, Long> {
    @Query(value = "SELECT SUM(account_balance) FROM account_balance", nativeQuery = true)
    double getAccountsSum();
}
