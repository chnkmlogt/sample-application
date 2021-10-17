package com.cihankamilogut.testapp.cucumber;

import com.cihankamilogut.testapp.SampleApplicationApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = SampleApplicationApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
