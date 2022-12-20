package com.example.myaccounting.repository;

import com.example.myaccounting.model.IncomeTransaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeTransactionCRUDRepository extends CrudRepository<IncomeTransaction, Long> {
}
