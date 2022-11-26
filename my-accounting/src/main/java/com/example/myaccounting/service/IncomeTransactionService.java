package com.example.myaccounting.service;

import com.example.myaccounting.model.IncomeTransaction;
import com.example.myaccounting.repository.IncomeTransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IncomeTransactionService {
    private IncomeTransactionRepository incomeTransactionRepository;

    public IncomeTransactionService(IncomeTransactionRepository incomeTransactionRepository) {
        this.incomeTransactionRepository = incomeTransactionRepository;
    }

    public List<IncomeTransaction> getAllIncomeTransactions() {
        return (List<IncomeTransaction>) incomeTransactionRepository.findAll();
    }

    public Optional<IncomeTransaction> getIncomeTransactionById(Long incomeTransactionId) {
        return incomeTransactionRepository.findById(incomeTransactionId);
    }

    public IncomeTransaction saveIncomeTransaction(IncomeTransaction incomeTransaction) {
        incomeTransactionRepository.save(incomeTransaction);
        return incomeTransaction;
    }

    public IncomeTransaction updateIncomeTransaction(IncomeTransaction incomeTransaction) {
        incomeTransactionRepository.save(incomeTransaction);
        return incomeTransaction;
    }

    public IncomeTransaction deleteIncomeTransaction(IncomeTransaction incomeTransaction) {
        incomeTransactionRepository.delete(incomeTransaction);
        return incomeTransaction;
    }
}
