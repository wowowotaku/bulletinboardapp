package com.example.bulletinboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bulletinboard.entity.Rank;

public interface RankRepository extends JpaRepository<Rank, Integer>{

}
