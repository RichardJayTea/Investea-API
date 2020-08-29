package com.richardjaytea.investea.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Transaction {

    @Id @GeneratedValue
    private long id;

    private long volume;
    private BigDecimal price;
    private String comment;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    @ManyToOne
    @JoinColumn(name = "stock_id")
    private Stock stock;

    @ManyToOne
    @JoinColumn(name = "type")
    private TransactionType type;

    public Transaction() {
    }

    public Transaction(Portfolio portfolio, Stock stock, long volume, BigDecimal price, TransactionType type, String comment) {
        this.portfolio = portfolio;
        this.stock = stock;
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

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
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

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
