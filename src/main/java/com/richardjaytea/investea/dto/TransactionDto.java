package com.richardjaytea.investea.dto;

import com.richardjaytea.investea.model.Portfolio;

import java.math.BigDecimal;

public interface TransactionDto {

    long getId();
    String getStock();
    long getVolume();
    BigDecimal getPrice();
    Integer getType();
    String getComment();

    Portfolio getPortfolio();
}
