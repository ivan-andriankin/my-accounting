package com.example.myaccounting.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "outcome_item")
public class OutcomeItem {
    @Id
    @Column(name = "outcome_item_id")
    private Long outcomeItemId;
    @Column(name = "outcome_item_name")
    private String outcomeItemName;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public Long getOutcomeItemId() {
        return this.outcomeItemId;
    }

    @SuppressWarnings("all")
    public String getOutcomeItemName() {
        return this.outcomeItemName;
    }

    @SuppressWarnings("all")
    public void setOutcomeItemId(final Long outcomeItemId) {
        this.outcomeItemId = outcomeItemId;
    }

    @SuppressWarnings("all")
    public void setOutcomeItemName(final String outcomeItemName) {
        this.outcomeItemName = outcomeItemName;
    }

    @SuppressWarnings("all")
    public OutcomeItem() {
    }

    @SuppressWarnings("all")
    public OutcomeItem(final Long outcomeItemId, final String outcomeItemName) {
        this.outcomeItemId = outcomeItemId;
        this.outcomeItemName = outcomeItemName;
    }
    //</editor-fold>
}
