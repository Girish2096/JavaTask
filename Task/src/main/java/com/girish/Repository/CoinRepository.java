package com.girish.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.girish.Model.Coin;
@Repository
public interface CoinRepository extends JpaRepository<Coin, Long>{

}
