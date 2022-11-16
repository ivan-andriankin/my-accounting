package com.example.myaccounting.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "income_item")
public class IncomeItem {
    @Id
    @Column(name = "income_item_id")
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

    @SuppressWarnings("all")
    public IncomeItem() {
    }

    @SuppressWarnings("all")
    public IncomeItem(final Long incomeItemId, final String incomeItemName) {
        this.incomeItemId = incomeItemId;
        this.incomeItemName = incomeItemName;
    }
    //</editor-fold>
}
