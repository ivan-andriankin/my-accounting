package com.example.myaccounting.service;

import com.example.myaccounting.model.OutcomeTransaction;
import com.example.myaccounting.repository.IncomeTransactionJPARepository;
import com.example.myaccounting.repository.OutcomeTransactionCRUDRepository;
import com.example.myaccounting.repository.OutcomeTransactionJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OutcomeTransactionService {
    private OutcomeTransactionCRUDRepository outcomeTransactionCRUDRepository;

    public OutcomeTransactionService(OutcomeTransactionCRUDRepository outcomeTransactionCRUDRepository) {
        this.outcomeTransactionCRUDRepository = outcomeTransactionCRUDRepository;
    }

    public List<OutcomeTransaction> getAllOutcomeTransactions() {
        return (List<OutcomeTransaction>) outcomeTransactionCRUDRepository.findAll();
    }

    public OutcomeTransaction getOutcomeTransactionById(Long outcomeTransactionId) {
        return outcomeTransactionCRUDRepository.findById(outcomeTransactionId).get();
    }

    public OutcomeTransaction saveOutcomeTransaction(OutcomeTransaction outcomeTransaction) {
        outcomeTransactionCRUDRepository.save(outcomeTransaction);
        return outcomeTransaction;
    }

    public OutcomeTransaction updateOutcomeTransaction(OutcomeTransaction outcomeTransaction) {
        outcomeTransactionCRUDRepository.save(outcomeTransaction);
        return outcomeTransaction;
    }

    public OutcomeTransaction deleteOutcomeTransaction(OutcomeTransaction outcomeTransaction) {
        outcomeTransactionCRUDRepository.delete(outcomeTransaction);
        return outcomeTransaction;
    }

    // JPA:
    @Autowired
    private OutcomeTransactionJPARepository outcomeTransactionJPARepository;

    public double getOutcomeSum() {
        return outcomeTransactionJPARepository.getOutcomeSum();
    }
}
