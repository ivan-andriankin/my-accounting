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
@Table(name = "outcome_item")
public class OutcomeItem {
    @Id
    @GeneratedValue(generator = "outcome_item_id", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "outcome_item_id", initialValue = 1, allocationSize = 1)
    private Long outcomeItemId;

    @OneToMany(mappedBy = "outcomeItemId", cascade = CascadeType.ALL)
    private Set<OutcomeTransaction> outcomeTransactions;

    @Column(name = "outcome_item_name")
    private String outcomeItemName;

}
