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

    @RequestMapping(value = "/portfolio/all/{userId}")
    public List<Portfolio> getPortfolios(@PathVariable long userId)
    {
        return service.getPortfolios(userId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/portfolio")
    public void addPortfolio(@RequestBody Map<String, Object> payload)
    {
        User user = new User((Integer) payload.get("userId"));

        Portfolio portfolio = new Portfolio(
                (String) payload.get("name"),
                (String) payload.get("description"),
                user
        );

        service.addPortfolio(portfolio);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/portfolio/{id}")
    public void removePortfolio(@PathVariable long id)
    {
        service.removePortfolio(id);
    }
}
