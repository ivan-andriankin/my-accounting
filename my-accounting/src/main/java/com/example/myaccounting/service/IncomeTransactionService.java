package com.example.myaccounting.service;

import com.example.myaccounting.model.IncomeTransaction;
import com.example.myaccounting.repository.IncomeTransactionCRUDRepository;
import com.example.myaccounting.repository.IncomeTransactionJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeTransactionService {
    private IncomeTransactionCRUDRepository incomeTransactionCRUDRepository;

    public IncomeTransactionService(IncomeTransactionCRUDRepository incomeTransactionCRUDRepository) {
        this.incomeTransactionCRUDRepository = incomeTransactionCRUDRepository;
    }

    public List<IncomeTransaction> getAllIncomeTransactions() {
        return (List<IncomeTransaction>) incomeTransactionCRUDRepository.findAll();
    }

    public IncomeTransaction getIncomeTransactionById(Long incomeTransactionId) {
        return incomeTransactionCRUDRepository.findById(incomeTransactionId).get();
    }

    public IncomeTransaction saveIncomeTransaction(IncomeTransaction incomeTransaction) {
        incomeTransactionCRUDRepository.save(incomeTransaction);
        return incomeTransaction;
    }

    public IncomeTransaction updateIncomeTransaction(IncomeTransaction incomeTransaction) {
        incomeTransactionCRUDRepository.save(incomeTransaction);
        return incomeTransaction;
    }

    public IncomeTransaction deleteIncomeTransaction(IncomeTransaction incomeTransaction) {
        incomeTransactionCRUDRepository.delete(incomeTransaction);
        return incomeTransaction;
    }

    // JPA:
    @Autowired
    private IncomeTransactionJPARepository incomeTransactionJPARepository;

    public double getIncomeSum() {
        return incomeTransactionJPARepository.getIncomeSum();
    }

}
