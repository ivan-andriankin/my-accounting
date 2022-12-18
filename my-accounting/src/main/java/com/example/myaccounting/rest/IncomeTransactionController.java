package com.example.myaccounting.rest;

import com.example.myaccounting.model.IncomeItem;
import com.example.myaccounting.model.IncomeTransaction;
import com.example.myaccounting.service.IncomeItemService;
import com.example.myaccounting.service.IncomeTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/incomeTransaction")
public class IncomeTransactionController {
    @Autowired
    IncomeTransactionService incomeTransactionService;

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
    @Autowired
    private IncomeItemService incomeItemService;

    @GetMapping("/showIncomeTransactions")
    public String showIncomeTransactionsPage(Model model) {
        model.addAttribute("incomeTransactions", incomeTransactionService.getAllIncomeTransactions());
        return "show_income_transactions";
    }

    @GetMapping("/addIncomeTransaction")    // NOT WORKING YET
    public String showAddIncomeTransactionForm(Model model) {
        IncomeTransaction incomeTransaction = new IncomeTransaction();
        model.addAttribute("incomeTransaction", incomeTransaction);
        model.addAttribute("incomeItems", incomeItemService.getAllIncomeItems());
        return "add_income_transaction_form";
    }

    /*@GetMapping("/addIncomeItem")       //show form for adding income item
    public String showAddIncomeItemForm(Model model) {
        IncomeItem incomeItem = new IncomeItem();
        model.addAttribute("incomeItem", incomeItem);
        return "add_income_item_form";
    }*/

    @PostMapping("/addIncomeTransaction")   // NOT WORKING YET
    public String addIncomeTransaction(@ModelAttribute("incomeTransaction") IncomeTransaction incomeTransaction) {
        incomeTransactionService.saveIncomeTransaction(incomeTransaction);
        return "redirect:/api/v1/incomeTransaction/showIncomeTransactions";
    }

    /*@PostMapping("/addIncomeItem")      //sends request for adding income item
    public String addIncomeItem(@ModelAttribute("incomeItem") IncomeItem incomeItem) {
        incomeItemService.saveIncomeItem(incomeItem);
        return "redirect:/api/v1/incomeItem/showIncomeItems";
    }*/
    // *** End of Thymeleaf ***


}
