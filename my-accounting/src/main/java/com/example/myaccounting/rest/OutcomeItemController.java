package com.example.myaccounting.rest;

import com.example.myaccounting.model.IncomeItem;
import com.example.myaccounting.model.OutcomeItem;
import com.example.myaccounting.service.OutcomeItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
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



    //  *** Thymeleaf: ***
    @GetMapping("/showOutcomeItems")
    public String showOutcomeItemsPage(Model model) {
        model.addAttribute("outcomeItems", outcomeItemService.getAllOutcomeItems());
        return "display/show_outcome_items";
    }

    @GetMapping("/addOutcomeItem")
    public String showAddOutcomeItemForm(Model model) {
        OutcomeItem outcomeItem = new OutcomeItem();
        model.addAttribute("outcomeItem", outcomeItem);
        //model.addAttribute("accountBalance", accountBalanceService.saveAccountBalance());
        return "add_outcome_item_form";
    }

    @PostMapping("/addOutcomeItem")
    public String addOutcomeItem(@ModelAttribute("outcomeItem") OutcomeItem outcomeItem) {
        outcomeItemService.saveOutcomeItem(outcomeItem);
        return "redirect:/api/v1/outcomeItem/showOutcomeItems";
    }

    // *** End of Thymeleaf ***
}
