package com.example.myaccounting.service;

import com.example.myaccounting.model.IncomeItem;
import com.example.myaccounting.repository.IncomeItemCRUDRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class IncomeItemService {
    private IncomeItemCRUDRepository incomeItemCRUDRepository;

    public IncomeItemService(IncomeItemCRUDRepository incomeItemCRUDRepository) {
        this.incomeItemCRUDRepository = incomeItemCRUDRepository;
    }

    public List<IncomeItem> getAllIncomeItems() {
        return (List<IncomeItem>) incomeItemCRUDRepository.findAll();
    }

    public IncomeItem getIncomeItemById(Long incomeItemId) {
        return incomeItemCRUDRepository.findById(incomeItemId).get();
    }

    public IncomeItem saveIncomeItem(IncomeItem incomeItem) {
        incomeItemCRUDRepository.save(incomeItem);
        return incomeItem;
    }

    public IncomeItem updateIncomeItem(IncomeItem incomeItem) {
        incomeItemCRUDRepository.save(incomeItem);
        return incomeItem;
    }

    public IncomeItem deleteIncomeItem(IncomeItem incomeItem) {
        incomeItemCRUDRepository.delete(incomeItem);
        return incomeItem;
    }

}
