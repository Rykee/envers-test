package com.test.envertest.repository;

import com.test.envertest.data.MyCustomPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomPlanRepository extends JpaRepository<MyCustomPlan, Long>, RevisionRepository<MyCustomPlan, Long, Long> {

}
