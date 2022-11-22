package com.example.myaccounting.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "outcome_transaction")
public class OutcomeTransaction {
    @Id
    @Column(name = "outcome_transaction_id")
    private Long outcomeTransactionId;
    @ManyToOne
    @JoinColumn(name = "outcome_item_id")
    private OutcomeItem outcomeItemId;
    @Column(name = "outcome_transaction_mny")
    private double outcomeTransactionMny;
    @Column(name = "outcome_transaction_date")
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date outcomeTransactionDate;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public Long getOutcomeTransactionId() {
        return this.outcomeTransactionId;
    }

    @SuppressWarnings("all")
    public OutcomeItem getOutcomeItemId() {
        return this.outcomeItemId;
    }

    @SuppressWarnings("all")
    public double getOutcomeTransactionMny() {
        return this.outcomeTransactionMny;
    }

    @SuppressWarnings("all")
    public Date getOutcomeTransactionDate() {
        return this.outcomeTransactionDate;
    }

    @SuppressWarnings("all")
    public void setOutcomeTransactionId(final Long outcomeTransactionId) {
        this.outcomeTransactionId = outcomeTransactionId;
    }

    @SuppressWarnings("all")
    public void setOutcomeItemId(final OutcomeItem outcomeItemId) {
        this.outcomeItemId = outcomeItemId;
    }

    @SuppressWarnings("all")
    public void setOutcomeTransactionMny(final double outcomeTransactionMny) {
        this.outcomeTransactionMny = outcomeTransactionMny;
    }

    @SuppressWarnings("all")
    public void setOutcomeTransactionDate(final Date outcomeTransactionDate) {
        this.outcomeTransactionDate = outcomeTransactionDate;
    }

    @SuppressWarnings("all")
    public OutcomeTransaction() {
    }

    @SuppressWarnings("all")
    public OutcomeTransaction(final Long outcomeTransactionId, final OutcomeItem outcomeItemId, final double outcomeTransactionMny, final Date outcomeTransactionDate) {
        this.outcomeTransactionId = outcomeTransactionId;
        this.outcomeItemId = outcomeItemId;
        this.outcomeTransactionMny = outcomeTransactionMny;
        this.outcomeTransactionDate = outcomeTransactionDate;
    }
    //</editor-fold>
}
