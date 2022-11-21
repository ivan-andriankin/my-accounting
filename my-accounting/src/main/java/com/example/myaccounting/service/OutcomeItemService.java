package com.example.myaccounting.service;

import com.example.myaccounting.model.IncomeItem;
import com.example.myaccounting.model.OutcomeItem;
import com.example.myaccounting.repository.OutcomeItemRepository;

import java.util.List;
import java.util.Optional;

public class OutcomeItemService {
    private OutcomeItemRepository outcomeItemRepository;

    public OutcomeItemService(OutcomeItemRepository outcomeItemRepository) {
        this.outcomeItemRepository = outcomeItemRepository;
    }

    public List<OutcomeItem> getAllOutcomeItems() {
        return (List<OutcomeItem>) outcomeItemRepository.findAll();
    }

    public Optional<OutcomeItem> getOutcomeItemById(Long outcomeItemId) {
        return outcomeItemRepository.findById(outcomeItemId);
    }

    public OutcomeItem saveOutcomeItem(OutcomeItem outcomeItem) {
        outcomeItemRepository.save(outcomeItem);
        return outcomeItem;
    }

    public OutcomeItem updateOutcomeItem(OutcomeItem outcomeItem) {
        outcomeItemRepository.save(outcomeItem);
        return outcomeItem;
    }

    public OutcomeItem deleteIncomeItem(OutcomeItem outcomeItem) {
        outcomeItemRepository.delete(outcomeItem);
        return outcomeItem;
    }
}
