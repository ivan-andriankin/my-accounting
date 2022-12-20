package com.example.myaccounting.service;

import com.example.myaccounting.model.OutcomeItem;
import com.example.myaccounting.repository.OutcomeItemCRUDRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OutcomeItemService {
    private OutcomeItemCRUDRepository outcomeItemCRUDRepository;

    public OutcomeItemService(OutcomeItemCRUDRepository outcomeItemCRUDRepository) {
        this.outcomeItemCRUDRepository = outcomeItemCRUDRepository;
    }

    public List<OutcomeItem> getAllOutcomeItems() {
        return (List<OutcomeItem>) outcomeItemCRUDRepository.findAll();
    }

    public OutcomeItem getOutcomeItemById(Long outcomeItemId) {
        return outcomeItemCRUDRepository.findById(outcomeItemId).get();
    }

    public OutcomeItem saveOutcomeItem(OutcomeItem outcomeItem) {
        outcomeItemCRUDRepository.save(outcomeItem);
        return outcomeItem;
    }

    public OutcomeItem updateOutcomeItem(OutcomeItem outcomeItem) {
        outcomeItemCRUDRepository.save(outcomeItem);
        return outcomeItem;
    }

    public OutcomeItem deleteIncomeItem(OutcomeItem outcomeItem) {
        outcomeItemCRUDRepository.delete(outcomeItem);
        return outcomeItem;
    }
}
