package com.richardjaytea.investea.repository;

import com.richardjaytea.investea.model.StockHistory;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface StockHistoryRepository extends CrudRepository<StockHistory, Long> {

    List<StockHistory> findByStockIdAndTimestampLessThan(long stockId, LocalDate timestamp);
}
