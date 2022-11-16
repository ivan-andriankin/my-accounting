package com.example.myaccounting.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="income_transaction")
public class IncomeTransaction {
    @Id
    @Column(name="income_transaction_id")
    private Long incomeTransactionId;

    @ManyToOne
    @Column(name="income_item_id")
    private IncomeItem incomeItemId;

    @Column(name="income_transaction_mny")
    private double incomeTransactionMny;

    @Column(name="income_transaction_date")
    @Temporal(TemporalType.DATE)
    private LocalDate incomeTransactionDate;
}
