package com.gabriel.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabriel.dslearnbds.entities.Reply;

@Repository
public interface ReplyRepository  extends JpaRepository<Reply, Long>{

}
