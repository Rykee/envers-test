package com.test.envertest.repository;

import com.test.envertest.data.ProgramEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramRepository extends JpaRepository<ProgramEntity, Long>, RevisionRepository<ProgramEntity, Long, Long> {

}
