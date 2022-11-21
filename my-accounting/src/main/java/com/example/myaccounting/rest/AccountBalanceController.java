package com.example.myaccounting.rest;

import com.example.myaccounting.model.AccountBalance;
import com.example.myaccounting.service.AccountBalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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
}
