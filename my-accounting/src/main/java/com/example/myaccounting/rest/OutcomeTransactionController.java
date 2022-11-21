package com.example.myaccounting.rest;

import com.example.myaccounting.model.OutcomeTransaction;
import com.example.myaccounting.service.OutcomeTransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/outcomeTransaction")
public class OutcomeTransactionController {
    OutcomeTransactionService outcomeTransactionService;

    public OutcomeTransactionController(OutcomeTransactionService outcomeTransactionService) {
        this.outcomeTransactionService = outcomeTransactionService;
    }

    @GetMapping
    public ResponseEntity<List<OutcomeTransaction>> getAllOutcomeTransactions() {
        return new ResponseEntity(outcomeTransactionService.getAllOutcomeTransactions(), HttpStatus.OK);
    }

    @GetMapping("/{outcomeTransactionId}")
    public ResponseEntity<OutcomeTransaction> getOutcomeTransactionById(@PathVariable("outcomeTransactionId") Long outcomeTransactionId) {
        return new ResponseEntity(outcomeTransactionService.getOutcomeTransactionById(outcomeTransactionId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<OutcomeTransaction> createOutcomeTransaction(@RequestBody OutcomeTransaction outcomeTransaction) {
        return new ResponseEntity(outcomeTransactionService.saveOutcomeTransaction(outcomeTransaction), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<OutcomeTransaction> updateOutcomeTransaction(@RequestBody OutcomeTransaction outcomeTransaction) {
        return new ResponseEntity(outcomeTransactionService.updateOutcomeTransaction(outcomeTransaction), HttpStatus.OK);
    }

    @DeleteMapping
    public String deleteOutcomeTransaction(OutcomeTransaction outcomeTransaction) {
        return "Outcome transaction has been deleted.";
    }
}
