package com.richardjaytea.investea.controller;

import com.richardjaytea.investea.model.Portfolio;
import com.richardjaytea.investea.model.User;
import com.richardjaytea.investea.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class PortfolioController {

    @Autowired
    private PortfolioService service;

    @RequestMapping(value = "user/{userId}/portfolio/all")
    public List<Portfolio> getPortfolios(@PathVariable long userId)
    {
        return service.getPortfolios(userId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "user/{userId}/portfolio")
    public void addPortfolio(@PathVariable long userId, @RequestBody Portfolio portfolio)
    {
        service.addPortfolio(userId, portfolio);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/portfolio/{id}")
    public void removePortfolio(@PathVariable long id)
    {
        service.removePortfolio(id);
    }
}
