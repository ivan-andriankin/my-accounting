package com.example.myaccounting.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "income_transaction")
public class IncomeTransaction {
    @Id
    @Column(name = "income_transaction_id")
    private Long incomeTransactionId;
    @ManyToOne
    @JoinColumn(name = "income_item_id")
    private IncomeItem incomeItemId;
    @Column(name = "income_transaction_mny")
    private double incomeTransactionMny;
    @Column(name = "income_transaction_date")
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date incomeTransactionDate;

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
    public Date getIncomeTransactionDate() {
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
    public void setIncomeTransactionDate(final Date incomeTransactionDate) {
        this.incomeTransactionDate = incomeTransactionDate;
    }

    @SuppressWarnings("all")
    public IncomeTransaction() {
    }

    @SuppressWarnings("all")
    public IncomeTransaction(final Long incomeTransactionId, final IncomeItem incomeItemId, final double incomeTransactionMny, final Date incomeTransactionDate) {
        this.incomeTransactionId = incomeTransactionId;
        this.incomeItemId = incomeItemId;
        this.incomeTransactionMny = incomeTransactionMny;
        this.incomeTransactionDate = incomeTransactionDate;
    }
    //</editor-fold>
}
