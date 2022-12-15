package com.example.myaccounting.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

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

    @Column(name = "income_item_name")
    private String incomeItemName;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public Long getIncomeItemId() {
        return this.incomeItemId;
    }

    @SuppressWarnings("all")
    public String getIncomeItemName() {
        return this.incomeItemName;
    }

    @SuppressWarnings("all")
    public void setIncomeItemId(final Long incomeItemId) {
        this.incomeItemId = incomeItemId;
    }

    @SuppressWarnings("all")
    public void setIncomeItemName(final String incomeItemName) {
        this.incomeItemName = incomeItemName;
    }

    //</editor-fold>
}
