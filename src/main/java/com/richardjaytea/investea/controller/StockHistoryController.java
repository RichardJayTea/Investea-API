package com.richardjaytea.investea.controller;

import com.richardjaytea.investea.model.StockHistory;
import com.richardjaytea.investea.service.StockHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockHistoryController {

    @Autowired
    StockHistoryService service;

    @RequestMapping(method = RequestMethod.POST, value = "/stock/{stockId}/history")
    public void addStockHistoryRecord(@PathVariable long stockId, @RequestBody StockHistory historyRecord)
    {
        service.addStockHistory(stockId, historyRecord);
    }

    @RequestMapping(value = "/stock/{stockId}/history/{intervalId}")
    public List<StockHistory> getStockHistoryInterval(@PathVariable long stockId, @PathVariable int intervalId)
    {
        return service.getStockHistoryByInterval(stockId, intervalId);
    }
}
