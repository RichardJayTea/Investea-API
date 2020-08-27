package com.richardjaytea.investea.repository;

import com.richardjaytea.investea.model.Transaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {

    List<Transaction> findByPortfolioId(long id);
}
