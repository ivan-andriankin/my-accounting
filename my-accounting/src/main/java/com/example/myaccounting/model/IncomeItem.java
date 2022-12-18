package com.example.myaccounting.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "income_item")
public class IncomeItem {

    @Id
    @GeneratedValue(generator = "income_item_id", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "income_item_id", initialValue = 1, allocationSize = 1)
    private Long incomeItemId;

    @OneToMany(mappedBy = "incomeItemId", cascade = CascadeType.ALL)
    private Set<IncomeTransaction> incomeTransactions;

    @Column(name = "income_item_name")
    private String incomeItemName;

}
