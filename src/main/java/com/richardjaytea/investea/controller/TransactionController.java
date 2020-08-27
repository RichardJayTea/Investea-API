package com.richardjaytea.investea.controller;

import com.richardjaytea.investea.model.Portfolio;
import com.richardjaytea.investea.model.Transaction;
import com.richardjaytea.investea.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class TransactionController {

    @Autowired
    TransactionService service;

    @RequestMapping(value = "/portfolio/{portfolioId}/transaction")
    public List<Transaction> getPortfolioTransactions(@PathVariable long portfolioId)
    {
        return service.getTransactions(portfolioId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/portfolio/{portfolioId}/transaction")
    public void addPortfolioTransaction(@PathVariable long portfolioId, @RequestBody Transaction transaction)
    {
        Portfolio portfolio = new Portfolio(portfolioId);
        transaction.setPortfolio(portfolio);

        service.addTransaction(transaction);
    }
}
