package com.example.myaccounting.repository;

import com.example.myaccounting.model.OutcomeTransaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutcomeTransactionCRUDRepository extends CrudRepository<OutcomeTransaction, Long> {
}
