package com.example.myaccounting.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "outcome_item")
public class OutcomeItem {
    @Id
    @GeneratedValue(generator = "outcome_item_id", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "outcome_item_id", initialValue = 1, allocationSize = 1)
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
