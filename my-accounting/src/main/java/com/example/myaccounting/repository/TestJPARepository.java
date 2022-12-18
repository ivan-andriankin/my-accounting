package com.example.myaccounting.repository;

import com.example.myaccounting.model.AccountBalance;

import com.example.myaccounting.model.IncomeItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestJPARepository extends JpaRepository<IncomeItem, Long> {
    @Query(value = "SELECT * FROM Income_Item", nativeQuery = true)
    List<IncomeItem> findAllRecords();
}
