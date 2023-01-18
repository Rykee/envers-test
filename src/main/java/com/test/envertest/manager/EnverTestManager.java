package com.test.envertest.manager;

import static lombok.AccessLevel.PRIVATE;

import com.test.envertest.data.MyCustomPlan;
import com.test.envertest.data.ProgramEntity;
import com.test.envertest.repository.CustomPlanRepository;
import com.test.envertest.repository.ProgramRepository;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED)
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = PRIVATE)
@Service
public class EnverTestManager {

  ProgramRepository programRepository;
  CustomPlanRepository customPlanRepository;

  public void saveProgram() {
    ProgramEntity programEntity = ProgramEntity.builder().build();
    MyCustomPlan plan = MyCustomPlan.builder().program(programEntity).build();
    programEntity.setCustomPlan(plan);
    customPlanRepository.save(plan);
    //programRepository.save(programEntity);
    // Same error if I save the customPlan first
  }
}
