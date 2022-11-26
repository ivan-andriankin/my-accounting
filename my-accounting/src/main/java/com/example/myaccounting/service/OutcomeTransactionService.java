package com.example.myaccounting.service;

import com.example.myaccounting.model.OutcomeTransaction;
import com.example.myaccounting.repository.OutcomeTransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OutcomeTransactionService {
    private OutcomeTransactionRepository outcomeTransactionRepository;

    public OutcomeTransactionService(OutcomeTransactionRepository outcomeTransactionRepository) {
        this.outcomeTransactionRepository = outcomeTransactionRepository;
    }

    public List<OutcomeTransaction> getAllOutcomeTransactions() {
        return (List<OutcomeTransaction>) outcomeTransactionRepository.findAll();
    }

    public Optional<OutcomeTransaction> getOutcomeTransactionById(Long outcomeTransactionId) {
        return outcomeTransactionRepository.findById(outcomeTransactionId);
    }

    public OutcomeTransaction saveOutcomeTransaction(OutcomeTransaction outcomeTransaction) {
        outcomeTransactionRepository.save(outcomeTransaction);
        return outcomeTransaction;
    }

    public OutcomeTransaction updateOutcomeTransaction(OutcomeTransaction outcomeTransaction) {
        outcomeTransactionRepository.save(outcomeTransaction);
        return outcomeTransaction;
    }

    public OutcomeTransaction deleteOutcomeTransaction(OutcomeTransaction outcomeTransaction) {
        outcomeTransactionRepository.delete(outcomeTransaction);
        return outcomeTransaction;
    }
}
