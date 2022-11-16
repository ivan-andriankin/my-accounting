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
@Table(name="income_item")
public class IncomeItem {
    @Id
    @Column(name="income_item_id")
    private Long incomeItemId;

    @Column(name="income_item_name")
    private String incomeItemName;
}
