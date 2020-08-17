package com.richardjaytea.investea.repository;

import com.richardjaytea.investea.dto.UserFollowersDto;
import com.richardjaytea.investea.dto.UserFollowsDto;
import com.richardjaytea.investea.model.Follow;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FollowRepository extends CrudRepository<Follow, Long> {

    List<UserFollowersDto> findByFollowsId(long id);

    List<UserFollowsDto> findByUserId(long id);
}
