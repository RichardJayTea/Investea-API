package com.richardjaytea.investea.controller;

import com.richardjaytea.investea.dto.UserFollowersDto;
import com.richardjaytea.investea.dto.UserFollowsDto;
import com.richardjaytea.investea.model.Follow;
import com.richardjaytea.investea.model.User;
import com.richardjaytea.investea.service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class FollowController {

    @Autowired
    private FollowService service;

    @RequestMapping(value = "/follow/{id}")
    public List<UserFollowersDto> getFollowers(@PathVariable long id)
    {
        return service.getFollowers(id);
    }

    @RequestMapping(value = "/follows/{id}")
    public List<UserFollowsDto> getFollows(@PathVariable long id)
    {
        return service.getFollows(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/follow")
    public void addFollowers(@RequestBody Map<String, Integer> payload)
    {
        User follower = new User();
        User follows = new User();

        follower.setId(payload.get("userId"));
        follows.setId(payload.get("followsUserId"));

        Follow follow = new Follow(follower, follows);
        service.addFollower(follow);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/follow/{id}")
    public void removeFollower(@RequestBody Follow follow, long id)
    {
        service.removeFollower(follow);
    }
}
