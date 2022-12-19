package com.example.myaccounting.rest;

import com.example.myaccounting.model.AccountBalance;
import com.example.myaccounting.service.AccountBalanceService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/accountBalance")
public class AccountBalanceController {

    private AccountBalanceService accountBalanceService;

    public AccountBalanceController(AccountBalanceService accountBalanceService) {
        this.accountBalanceService = accountBalanceService;
    }

    @GetMapping
    public ResponseEntity<List<AccountBalance>> getAllAccountBalances() {
        return new ResponseEntity(accountBalanceService.getAllAccountBalances(), HttpStatus.OK);
    }

    @GetMapping("/{accountId}")
    public ResponseEntity<List<AccountBalance>> getAccountBalanceById(@PathVariable("accountId") Long accountId) {
        return new ResponseEntity(accountBalanceService.getAccountBalanceById(accountId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<AccountBalance> createAccountBalance(@RequestBody AccountBalance accountBalance) {
        return new ResponseEntity(accountBalanceService.saveAccountBalance(accountBalance), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<AccountBalance> updateAccountBalanceName(@RequestBody AccountBalance accountBalance) {
        return new ResponseEntity(accountBalanceService.updateAccountBalance(accountBalance), HttpStatus.OK);
    }

    @DeleteMapping
    public String deleteAccountBalance(@RequestBody AccountBalance accountBalance) {
        return "Account has been deleted.";
    }



    //  *** Thymeleaf: ***
    @GetMapping("/showAccounts")
    public String showAccountsPage(Model model) {
        model.addAttribute("accounts", accountBalanceService.getAllAccountBalances());
        return "display/show_account_balances";
    }

    @GetMapping("/addAccountBalance")
    public String showAddAccountBalanceForm(Model model) {
        AccountBalance accountBalance = new AccountBalance();
        model.addAttribute("accountBalance", accountBalance);
        return "forms/add_account_balance_form";
    }

    @PostMapping("/addAccountBalance")
    public String addAccountBalance(@ModelAttribute("accountBalance") AccountBalance accountBalance) {
        accountBalanceService.saveAccountBalance(accountBalance);
        return "redirect:/api/v1/accountBalance/showAccounts";
    }
    // *** End of Thymeleaf ***

}
