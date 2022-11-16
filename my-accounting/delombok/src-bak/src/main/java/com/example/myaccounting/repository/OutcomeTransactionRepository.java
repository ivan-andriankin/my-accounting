package com.example.myaccounting.repository;

import com.example.myaccounting.model.OutcomeTransaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutcomeTransactionRepository extends CrudRepository<OutcomeTransaction, Long> {

}
