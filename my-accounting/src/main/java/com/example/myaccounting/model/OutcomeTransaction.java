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
@Table(name="outcome_transaction")
public class OutcomeTransaction {
    @Id
    @Column(name="outcome_transaction_id")
    private Long outcomeTransactionId;

    @ManyToOne
    @Column(name="outcome_item_id")
    private OutcomeItem outcomeItemId;

    @Column(name="outcome_transaction_mny")
    private double outcomeTransactionMny;

    @Column(name="outcome_transaction_date")
    @Temporal(TemporalType.DATE)
    private LocalDate outcomeTransactionDate;
}
