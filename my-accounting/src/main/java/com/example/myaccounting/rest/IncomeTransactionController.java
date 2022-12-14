package com.example.myaccounting.rest;

import com.example.myaccounting.model.IncomeTransaction;
import com.example.myaccounting.service.IncomeTransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/incomeTransaction")
public class IncomeTransactionController {
    IncomeTransactionService incomeTransactionService;

    public IncomeTransactionController(IncomeTransactionService incomeTransactionService) {
        this.incomeTransactionService = incomeTransactionService;
    }

    @GetMapping
    public ResponseEntity<List<IncomeTransaction>> getAllIncomeTransactions() {
        return new ResponseEntity(incomeTransactionService.getAllIncomeTransactions(), HttpStatus.OK);
    }

    @GetMapping("/{incomeTransactionId}")
    public ResponseEntity<List<IncomeTransaction>> getIncomeTransactionById(@PathVariable("incomeTransactionId") Long incomeTransactionId) {
        return new ResponseEntity(incomeTransactionService.getIncomeTransactionById(incomeTransactionId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<IncomeTransaction> createIncomeTransaction(@RequestBody IncomeTransaction incomeTransaction) {
        return new ResponseEntity(incomeTransactionService.saveIncomeTransaction(incomeTransaction), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<IncomeTransaction> updateIncomeTransaction(@RequestBody IncomeTransaction incomeTransaction) {
        return new ResponseEntity(incomeTransactionService.updateIncomeTransaction(incomeTransaction), HttpStatus.OK);
    }

    @DeleteMapping
    public String deleteIncomeTransaction(@RequestBody IncomeTransaction incomeTransaction) {
        return "Income transaction has been deleted.";
    }
}
