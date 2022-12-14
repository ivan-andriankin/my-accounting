package com.example.myaccounting.rest;

import com.example.myaccounting.model.IncomeItem;
import com.example.myaccounting.service.IncomeItemService;
import com.example.myaccounting.service.IncomeTransactionService;
import com.example.myaccounting.service.TestJPAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Controller
@RequestMapping("/api/v1/testJPA")
public class TestJPAController {

    @Autowired
    private TestJPAService testJPAService;
    @Autowired
    private IncomeItemService incomeItemService;
    @Autowired
    private IncomeTransactionService incomeTransactionService;

    @GetMapping("/111")
    public ResponseEntity<List<IncomeItem>> displayRecordsFromDB() {
        return new ResponseEntity(testJPAService.getAllRecordsFromDB(), HttpStatus.OK);
    }

    @GetMapping("/222")
    public ResponseEntity<IncomeItem> displayIncomeItemMapFromDB() {
        return new ResponseEntity(testJPAService.makeMapWithIncomeItemFromDB(), HttpStatus.OK);
    }

    @GetMapping("/testShow")
    public String showIncomeItemsPage(Model model) {
        Long incomeItemId = (long) 1;
        Long incomeTransactionId = (long) 1;
        model.addAttribute("incomeItem", incomeItemService.getIncomeItemById(incomeItemId));
        model.addAttribute("incomeTransaction", incomeTransactionService.getIncomeTransactionById(incomeTransactionId));
        return "test_show";
    }
}
