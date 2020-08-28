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

    @RequestMapping(value = "/followers/{id}")
    public List<UserFollowersDto> getFollowers(@PathVariable long id)
    {
        return service.getFollowers(id);
    }

    @RequestMapping(value = "/following/{id}")
    public List<UserFollowsDto> getFollowing(@PathVariable long id)
    {
        return service.getFollows(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/follow")
    public void addFollowers(@RequestBody Map<String, Integer> payload)
    {
        service.addFollower(payload.get("userId"), payload.get("followsUserId"));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/follow/{id}")
    public void removeFollower(@PathVariable long id)
    {
        service.removeFollower(id);
    }
}
