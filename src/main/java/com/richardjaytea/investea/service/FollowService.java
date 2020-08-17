package com.richardjaytea.investea.service;

import com.richardjaytea.investea.dto.UserFollowersDto;
import com.richardjaytea.investea.dto.UserFollowsDto;
import com.richardjaytea.investea.model.Follow;
import com.richardjaytea.investea.repository.FollowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowService {

    @Autowired
    private FollowRepository repository;

    public List<UserFollowersDto> getFollowers(long userId)
    {
        return repository.findByFollowsId(userId);
    }

    public List<UserFollowsDto> getFollows(long userId)
    {
        return repository.findByUserId(userId);
    }

    public void addFollower(Follow follow)
    {
        repository.save(follow);
    }

    public void removeFollower(Follow follow)
    {
        repository.delete(follow);
    }
}
