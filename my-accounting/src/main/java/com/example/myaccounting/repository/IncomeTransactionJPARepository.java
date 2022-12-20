package com.example.myaccounting.repository;

import com.example.myaccounting.model.IncomeItem;
import com.example.myaccounting.model.IncomeTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IncomeTransactionJPARepository extends JpaRepository<IncomeTransaction, Long> {
    @Query(value = "SELECT SUM(income_transaction_mny) FROM income_transaction", nativeQuery = true)
    double getIncomeSum();
}
