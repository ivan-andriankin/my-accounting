package com.example.myaccounting.repository;

import com.example.myaccounting.model.OutcomeItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutcomeItemRepository extends CrudRepository<OutcomeItem, Long> {
}
