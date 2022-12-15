package com.example.myaccounting.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "outcome_transaction")
public class OutcomeTransaction {
    @Id
    @GeneratedValue(generator = "outcome_transaction_id", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "outcome_transaction_id", initialValue = 1, allocationSize = 1)
    private Long outcomeTransactionId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "outcome_item_id")
    private OutcomeItem outcomeItemId;

    @Column(name = "outcome_transaction_mny")
    private double outcomeTransactionMny;

    @Column(name = "outcome_transaction_date")
    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date outcomeTransactionDate;


}
