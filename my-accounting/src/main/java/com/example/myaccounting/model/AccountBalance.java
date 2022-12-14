package com.example.myaccounting.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="account_balance")
public class AccountBalance {
    @Id
    @GeneratedValue(generator = "account_id", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "account_id", initialValue = 1, allocationSize = 1)
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
