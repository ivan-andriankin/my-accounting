package com.example.myaccounting.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}
