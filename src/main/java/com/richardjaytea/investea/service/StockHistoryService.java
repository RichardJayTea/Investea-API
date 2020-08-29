package com.richardjaytea.investea.service;

import com.richardjaytea.investea.model.Stock;
import com.richardjaytea.investea.model.StockHistory;
import com.richardjaytea.investea.repository.StockHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.threeten.extra.Temporals;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

@Service
public class StockHistoryService {

    @Autowired
    StockHistoryRepository repository;

    public void addStockHistory(long stockId, StockHistory historyRecord)
    {
        Stock stock = new Stock(stockId);
        historyRecord.setStock(stock);

        repository.save(historyRecord);
    }

    public List<StockHistory> getStockHistoryByInterval(long stockId, int intervalId)
    {
        LocalDate today = LocalDate.now(ZoneId.of("America/Los_Angeles"));

        if (today.getDayOfWeek() == DayOfWeek.SATURDAY || today.getDayOfWeek() == DayOfWeek.SUNDAY) {
            return repository.findByStockIdAndTimestampLessThan(stockId, today.with(Temporals.previousWorkingDay()));
        } else {
            return repository.findByStockIdAndTimestampLessThan(stockId, today);
        }

    }
}
