package com.example.myaccounting.service;

import com.example.myaccounting.model.AccountBalance;
import com.example.myaccounting.model.IncomeItem;
import com.example.myaccounting.repository.IncomeItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IncomeItemService {
    private IncomeItemRepository incomeItemRepository;

    public IncomeItemService(IncomeItemRepository incomeItemRepository) {
        this.incomeItemRepository = incomeItemRepository;
    }

    public List<IncomeItem> getAllIncomeItems() {
        return (List<IncomeItem>) incomeItemRepository.findAll();
    }

    public Optional<IncomeItem> getIncomeItemById(Long incomeItemId) {
        return incomeItemRepository.findById(incomeItemId);
    }

    public IncomeItem saveIncomeItem(IncomeItem incomeItem) {
        incomeItemRepository.save(incomeItem);
        return incomeItem;
    }

    public IncomeItem updateIncomeItem(IncomeItem incomeItem) {
        incomeItemRepository.save(incomeItem);
        return incomeItem;
    }

    public IncomeItem deleteIncomeItem(IncomeItem incomeItem) {
        incomeItemRepository.delete(incomeItem);
        return incomeItem;
    }
}
