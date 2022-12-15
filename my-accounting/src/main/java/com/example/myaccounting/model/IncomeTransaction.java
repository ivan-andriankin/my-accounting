package com.example.myaccounting.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "income_transaction")
public class IncomeTransaction {
    @Id
    @GeneratedValue(generator = "income_transaction_id", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "income_transaction_id", initialValue = 1, allocationSize = 1)
    private Long incomeTransactionId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "income_item_id")
    private IncomeItem incomeItem;

    @Column(name = "income_transaction_mny")
    private double incomeTransactionMny;

    @Column(name = "income_transaction_date")
    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date incomeTransactionDate;


}
