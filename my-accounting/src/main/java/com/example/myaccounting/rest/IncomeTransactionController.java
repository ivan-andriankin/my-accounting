package com.example.myaccounting.rest;

import com.example.myaccounting.model.IncomeTransaction;
import com.example.myaccounting.service.IncomeItemService;
import com.example.myaccounting.service.IncomeTransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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



    //  *** Thymeleaf: ***
    @GetMapping("/showIncomeTransactions")  // NOT WORKING YET
    public String showIncomeTransactionsPage(Model model) {
        model.addAttribute("incomeTransactions", incomeTransactionService.getAllIncomeTransactions());
        return "show_income_transactions";
    }

    @GetMapping("/addIncomeTransaction")    // NOT WORKING YET
    public String showAddIncomeTransactionForm(Model model) {

        IncomeTransaction incomeTransaction = new IncomeTransaction();
        model.addAttribute("incomeTransaction", incomeTransaction);

        List<String> incomeItemsList = new ArrayList<String>();

        //model.addAttribute("accountBalance", accountBalanceService.saveAccountBalance());
        return "add_income_transaction_form";
    }

    @PostMapping("/addIncomeTransaction")   // NOT WORKING YET
    public String addIncomeTransaction(@ModelAttribute("incomeTransaction") IncomeTransaction incomeTransaction) {
        incomeTransactionService.saveIncomeTransaction(incomeTransaction);
        return "redirect:/api/v1/incomeTransaction/showIncomeTransactions";
    }
    // *** End of Thymeleaf ***


}
