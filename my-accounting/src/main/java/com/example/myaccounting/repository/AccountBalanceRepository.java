package com.example.myaccounting.repository;

import com.example.myaccounting.model.AccountBalance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountBalanceRepository extends CrudRepository<AccountBalance, Long> {

}
