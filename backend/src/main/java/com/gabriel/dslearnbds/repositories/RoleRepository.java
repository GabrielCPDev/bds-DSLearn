package com.gabriel.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabriel.dslearnbds.entities.Course;

@Repository
public interface RoleRepository  extends JpaRepository<Course, Long>{

}
