package com.richardjaytea.investea.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Stock {

    @Id @GeneratedValue
    private long id;

    private String ticker;
    private String name;
    private String about;
    private String website;

    public Stock() {
    }

    public Stock(long id) {
        this.id = id;
    }

    public Stock(String ticker, String name, String about, String website) {
        this.ticker = ticker;
        this.name = name;
        this.about = about;
        this.website = website;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
