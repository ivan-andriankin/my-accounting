package com.example.myaccounting.rest;

import com.example.myaccounting.service.AccountBalanceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/accountBalance")
public class AccountBalanceController {
    private AccountBalanceService accountBalanceService;

    @GetMapping
    public ResponseEntity getAllAccountBalances() {
        return new ResponseEntity(accountBalanceService.getAllAccountBalances(), HttpStatus.OK);
    }

    @
}
