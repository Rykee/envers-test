package com.test.envertest.api.controller;

import static lombok.AccessLevel.PRIVATE;

import com.test.envertest.manager.EnverTestManager;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = PRIVATE)
public class EnverTestController {

  EnverTestManager enverTestManager;

  @PostMapping("/test")
  public ResponseEntity<Void> testSaveProgram(){
    enverTestManager.saveProgram();
    return ResponseEntity.ok().build();
  }

}
