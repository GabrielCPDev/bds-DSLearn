package com.gabriel.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabriel.dslearnbds.entities.Enrollment;
import com.gabriel.dslearnbds.entities.pk.EnrollmentPK;

@Repository
public interface EnrollmentRepository  extends JpaRepository<Enrollment, EnrollmentPK>{

}
