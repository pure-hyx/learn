package edu.hubu.learn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hubu.learn.entity.Pure;

public interface PureDao extends JpaRepository<Pure, Long> {

}