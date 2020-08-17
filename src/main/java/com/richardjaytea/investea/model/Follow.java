package com.richardjaytea.investea.model;

import javax.persistence.*;

@Entity
public class Follow {

    @Id @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "follows_user_id")
    private User follows;

    public Follow() {
    }

    public Follow(User user, User follows) {
        this.user = user;
        this.follows = follows;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getFollows() {
        return follows;
    }

    public void setFollows(User follows) {
        this.follows = follows;
    }
}
