package com.richardjaytea.investea.model;


import javax.persistence.*;

@Entity
public class Portfolio {

    @Id @GeneratedValue
    private long id;

    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Portfolio() {
    }

    public Portfolio(long id){
        this.id = id;
    }

    public Portfolio(String name, String description, User user) {
        this.name = name;
        this.description = description;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
