package com.richardjaytea.investea.controller;

import com.richardjaytea.investea.dto.TransactionDto;
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
    public List<TransactionDto> getPortfolioTransactions(@PathVariable long portfolioId)
    {
        return service.getTransactions(portfolioId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/portfolio/{portfolioId}/transaction/{transactionTypeId}/{stockId}")
    public void addPortfolioTransaction(@PathVariable long portfolioId, @PathVariable long transactionTypeId, @PathVariable long stockId, @RequestBody Transaction transaction)
    {
        service.addTransaction(portfolioId, transactionTypeId, stockId, transaction);
    }
}
