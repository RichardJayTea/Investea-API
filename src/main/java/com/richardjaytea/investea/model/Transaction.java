package com.richardjaytea.investea.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Transaction {

    @Id @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    private String ticker;
    private long volume;
    private BigDecimal price;
    private Integer type;
    private String comment;

    public Transaction() {
    }

    public Transaction(Portfolio portfolio, String ticker, long volume, BigDecimal price, Integer type, String comment) {
        this.portfolio = portfolio;
        this.ticker = ticker;
        this.volume = volume;
        this.price = price;
        this.type = type;
        this.comment = comment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
