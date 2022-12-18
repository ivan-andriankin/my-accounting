package com.example.myaccounting.repository;

import com.example.myaccounting.model.IncomeItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeItemRepository extends CrudRepository<IncomeItem, Long> {
}
