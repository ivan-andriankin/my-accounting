package com.example.myaccounting.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "income_transaction")
public class IncomeTransaction {
    @Id
    @Column(name = "income_transaction_id")
    private Long incomeTransactionId;
    @ManyToOne
    @Column(name = "income_item_id")
    private IncomeItem incomeItemId;
    @Column(name = "income_transaction_mny")
    private double incomeTransactionMny;
    @Column(name = "income_transaction_date")
    @Temporal(TemporalType.DATE)
    private LocalDate incomeTransactionDate;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public Long getIncomeTransactionId() {
        return this.incomeTransactionId;
    }

    @SuppressWarnings("all")
    public IncomeItem getIncomeItemId() {
        return this.incomeItemId;
    }

    @SuppressWarnings("all")
    public double getIncomeTransactionMny() {
        return this.incomeTransactionMny;
    }

    @SuppressWarnings("all")
    public LocalDate getIncomeTransactionDate() {
        return this.incomeTransactionDate;
    }

    @SuppressWarnings("all")
    public void setIncomeTransactionId(final Long incomeTransactionId) {
        this.incomeTransactionId = incomeTransactionId;
    }

    @SuppressWarnings("all")
    public void setIncomeItemId(final IncomeItem incomeItemId) {
        this.incomeItemId = incomeItemId;
    }

    @SuppressWarnings("all")
    public void setIncomeTransactionMny(final double incomeTransactionMny) {
        this.incomeTransactionMny = incomeTransactionMny;
    }

    @SuppressWarnings("all")
    public void setIncomeTransactionDate(final LocalDate incomeTransactionDate) {
        this.incomeTransactionDate = incomeTransactionDate;
    }

    @SuppressWarnings("all")
    public IncomeTransaction() {
    }

    @SuppressWarnings("all")
    public IncomeTransaction(final Long incomeTransactionId, final IncomeItem incomeItemId, final double incomeTransactionMny, final LocalDate incomeTransactionDate) {
        this.incomeTransactionId = incomeTransactionId;
        this.incomeItemId = incomeItemId;
        this.incomeTransactionMny = incomeTransactionMny;
        this.incomeTransactionDate = incomeTransactionDate;
    }
    //</editor-fold>
}
