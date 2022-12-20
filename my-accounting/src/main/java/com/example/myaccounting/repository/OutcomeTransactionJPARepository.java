package com.example.myaccounting.repository;

import com.example.myaccounting.model.OutcomeTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OutcomeTransactionJPARepository extends JpaRepository<OutcomeTransaction, Long> {
    @Query(value = "SELECT SUM(outcome_transaction_mny) FROM outcome_transaction", nativeQuery = true)
    double getOutcomeSum();
}
