package com.richardjaytea.investea.service;

import com.richardjaytea.investea.model.Transaction;
import com.richardjaytea.investea.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository repository;

    public List<Transaction> getTransactions(long portfolioId)
    {
        return repository.findByPortfolioId(portfolioId);
    }

    public void addTransaction(Transaction transaction)
    {
        repository.save(transaction);
    }
}
