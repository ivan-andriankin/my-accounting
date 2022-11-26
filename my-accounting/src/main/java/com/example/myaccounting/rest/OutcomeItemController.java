package com.example.myaccounting.rest;

import com.example.myaccounting.model.OutcomeItem;
import com.example.myaccounting.service.OutcomeItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/outcomeItem")
public class OutcomeItemController {
    OutcomeItemService outcomeItemService;

    public OutcomeItemController(OutcomeItemService outcomeItemService) {
        this.outcomeItemService = outcomeItemService;
    }

    @GetMapping
    public ResponseEntity<List<OutcomeItem>> getAllIncomeItems() {
        return new ResponseEntity(outcomeItemService.getAllOutcomeItems(), HttpStatus.OK);
    }

    @GetMapping("/{outcomeItemId}")
    public ResponseEntity<List<OutcomeItem>> getOutcomeItemById(@PathVariable("outcomeItemId") Long outcomeItemId) {
        return new ResponseEntity(outcomeItemService.getOutcomeItemById(outcomeItemId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<OutcomeItem> createOutcomeItem(@RequestBody OutcomeItem outcomeItem) {
        return new ResponseEntity(outcomeItemService.saveOutcomeItem(outcomeItem), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<OutcomeItem> updateOutcomeItem(@RequestBody OutcomeItem outcomeItem) {
        return new ResponseEntity(outcomeItemService.updateOutcomeItem(outcomeItem), HttpStatus.OK);
    }

    @DeleteMapping
    public String deleteIncomeItem(@RequestBody OutcomeItem outcomeItem) {
        return "Outcome item has been deleted.";
    }
}
