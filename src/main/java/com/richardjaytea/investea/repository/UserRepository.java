package com.richardjaytea.investea.repository;

import com.richardjaytea.investea.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
