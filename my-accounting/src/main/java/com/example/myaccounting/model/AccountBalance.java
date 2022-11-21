package com.example.myaccounting.model;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Entity
@Table(name="account_balance")
public class AccountBalance {
    @Id
    @Column(name="account_id")
    private Long accountId;

    @Column(name="account_name")
    private String accountName;

    @Column(name="account_balance")
    private double accountBalance;

    public AccountBalance(Long accountId, String accountName, double accountBalance) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public AccountBalance() {
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
