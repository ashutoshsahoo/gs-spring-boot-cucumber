package com.ashu.practice;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
        plugin = {"pretty", "html:build/cucumber"},
        extraGlue = "com.ashu.practice.common")
public class CucumberIntegrationTest {

}
