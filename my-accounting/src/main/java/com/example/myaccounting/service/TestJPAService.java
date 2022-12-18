package com.example.myaccounting.service;

import com.example.myaccounting.model.IncomeItem;
import com.example.myaccounting.repository.TestJPARepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class TestJPAService {

    private TestJPARepository testJPARepository;

    public TestJPAService(TestJPARepository testJPARepository) {
        this.testJPARepository = testJPARepository;
    }

    public List<IncomeItem> getAllRecordsFromDB() {
        return testJPARepository.findAllRecords();
    }

    public Map<Long, String> makeMapWithIncomeItemFromDB() {
        List<IncomeItem> incomeItemList = testJPARepository.findAllRecords();

        Map<Long, String> IncomeItemsMap = new HashMap<>();
        incomeItemList.forEach(incomeItem -> IncomeItemsMap.put(incomeItem.getIncomeItemId(), incomeItem.getIncomeItemName()));

        return IncomeItemsMap;
    }
    
}
