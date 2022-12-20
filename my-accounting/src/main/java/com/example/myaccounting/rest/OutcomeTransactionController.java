package com.example.myaccounting.rest;

import com.example.myaccounting.model.OutcomeTransaction;
import com.example.myaccounting.service.OutcomeItemService;
import com.example.myaccounting.service.OutcomeTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/outcomeTransaction")
public class OutcomeTransactionController {
    @Autowired
    OutcomeTransactionService outcomeTransactionService;

    @GetMapping
    public ResponseEntity<List<OutcomeTransaction>> getAllOutcomeTransactions() {
        return new ResponseEntity(outcomeTransactionService.getAllOutcomeTransactions(), HttpStatus.OK);
    }

    @GetMapping("/{outcomeTransactionId}")
    public ResponseEntity<List<OutcomeTransaction>> getOutcomeTransactionById(@PathVariable("outcomeTransactionId") Long outcomeTransactionId) {
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
    public String deleteOutcomeTransaction(@RequestBody OutcomeTransaction outcomeTransaction) {
        return "Outcome transaction has been deleted.";
    }


    //  *** Thymeleaf: ***
    @Autowired
    private OutcomeItemService outcomeItemService;

    @GetMapping("/showOutcomeTransactions")  //show table with all outcome transactions
    public String showOutcomeTransactionsPage(Model model) {
        model.addAttribute("outcomeTransactions", outcomeTransactionService.getAllOutcomeTransactions());
        model.addAttribute("totalOutcomeMoney", String.format("%.2f", outcomeTransactionService.getOutcomeSum()));
        return "display/show_outcome_transactions";
    }

    @GetMapping("/addOutcomeTransaction")    //show form for adding outcome transactions
    public String showAddOutcomeTransactionForm(Model model) {
        OutcomeTransaction outcomeTransaction = new OutcomeTransaction();
        model.addAttribute("outcomeTransaction", outcomeTransaction);
        model.addAttribute("outcomeItems", outcomeItemService.getAllOutcomeItems());
        return "forms/add_outcome_transaction_form";
    }

    @PostMapping("/addOutcomeTransaction")   //sends request for adding outcome transactions
    public String addOutcomeTransaction(@ModelAttribute("outcomeTransaction") OutcomeTransaction outcomeTransaction) {
        outcomeTransactionService.saveOutcomeTransaction(outcomeTransaction);
        return "redirect:/api/v1/outcomeTransaction/showOutcomeTransactions";
    }
    // *** End of Thymeleaf ***
}
