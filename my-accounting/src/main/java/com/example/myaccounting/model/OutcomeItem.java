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
@Table(name="outcome_item")
public class OutcomeItem {
    @Id
    @Column(name="outcome_item_id")
    private Long outcomeItemId;

    @Column(name="outcome_item_id")
    private String outcomeItemName;
}
