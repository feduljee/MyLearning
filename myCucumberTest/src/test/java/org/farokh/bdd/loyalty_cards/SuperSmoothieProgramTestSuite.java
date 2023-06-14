package org.farokh.bdd.loyalty_cards;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.farokh.bdd.calculator.CalculatorTest;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/loyalty_cards",
        glue = "org.farokh.bdd"
)
public class SuperSmoothieProgramTestSuite {
}
