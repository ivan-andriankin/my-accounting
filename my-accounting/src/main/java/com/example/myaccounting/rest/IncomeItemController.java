package com.example.myaccounting.rest;

import com.example.myaccounting.model.AccountBalance;
import com.example.myaccounting.model.IncomeItem;
import com.example.myaccounting.model.IncomeTransaction;
import com.example.myaccounting.service.IncomeItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/incomeItem")
public class IncomeItemController {
    private IncomeItemService incomeItemService;

    public IncomeItemController(IncomeItemService incomeItemService) {
        this.incomeItemService = incomeItemService;
    }

    @GetMapping
    public ResponseEntity<List<IncomeItem>> getAllIncomeItems() {
        return new ResponseEntity(incomeItemService.getAllIncomeItems(), HttpStatus.OK);
    }

    @GetMapping("/{incomeItemId}")
    public ResponseEntity<List<IncomeItem>> getIncomeItemById(@PathVariable("incomeItemId") Long incomeItemId) {
        return new ResponseEntity(incomeItemService.getIncomeItemById(incomeItemId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<IncomeItem> createIncomeItem(@RequestBody IncomeItem incomeItem) {
        return new ResponseEntity(incomeItemService.saveIncomeItem(incomeItem), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<IncomeItem> updateIncomeItem(@RequestBody IncomeItem incomeItem) {
        return new ResponseEntity(incomeItemService.updateIncomeItem(incomeItem), HttpStatus.OK);
    }

    @DeleteMapping
    public String deleteIncomeItem(@RequestBody IncomeItem incomeItem) {
        return "Income item has been deleted.";
    }



    //  *** Thymeleaf: ***
    @GetMapping("/showIncomeItems")     //show table with all income items
    public String showIncomeItemsPage(Model model) {
        model.addAttribute("incomeItems", incomeItemService.getAllIncomeItems());
        return "display/show_income_items";
    }

    @GetMapping("/addIncomeItem")       //show form for adding income item
    public String showAddIncomeItemForm(Model model) {
        IncomeItem incomeItem = new IncomeItem();
        model.addAttribute("incomeItem", incomeItem);
        return "add_income_item_form";
    }

    @PostMapping("/addIncomeItem")      //sends request for adding income item
    public String addIncomeItem(@ModelAttribute("incomeItem") IncomeItem incomeItem) {
        incomeItemService.saveIncomeItem(incomeItem);
        return "redirect:/api/v1/incomeItem/showIncomeItems";
    }
    // *** End of Thymeleaf ***

}
