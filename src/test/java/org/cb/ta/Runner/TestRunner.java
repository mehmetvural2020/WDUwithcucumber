package org.cb.ta.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/org/cb/ta/Features"},    //feature files folder or package
        glue = {"org.cb.ta.TestSteps"}      //full package name for test files
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
