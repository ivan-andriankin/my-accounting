package com.example.myaccounting.repository;

import com.example.myaccounting.model.AccountBalance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountBalanceCRUDRepository extends CrudRepository<AccountBalance, Long> {
}
