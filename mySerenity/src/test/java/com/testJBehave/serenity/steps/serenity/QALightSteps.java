package com.testJBehave.serenity.steps.serenity;

import com.testJBehave.serenity.pages.DictionaryPage;
import com.testJBehave.serenity.pages.QALightHomePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class QALightSteps extends ScenarioSteps {
	
	QALightHomePage qaLightHomePage;

    @Step
    public void is_the_home_page() {
    	qaLightHomePage.open();
    }

    @Step
    public void checkUserFail() {
        Assert.fail("Assert work");
    }
}