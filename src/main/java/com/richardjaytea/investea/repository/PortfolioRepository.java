package com.richardjaytea.investea.repository;

import com.richardjaytea.investea.model.Portfolio;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PortfolioRepository extends CrudRepository<Portfolio, Long> {

    List<Portfolio> findByUserId(long id);
}
