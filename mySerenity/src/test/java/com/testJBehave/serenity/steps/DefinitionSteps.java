package com.testJBehave.serenity.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.testJBehave.serenity.steps.serenity.EndUserSteps;
import com.testJBehave.serenity.steps.serenity.QALightSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;
    
    @Steps
    QALightSteps qALightSteps;

    @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        endUser.is_the_home_page();
    }
    
    @Given("the user is on the QALight home page")
    public void givenTheUserIsOnTheQALightHomePage() {
        qALightSteps.is_the_home_page();
    }


    @When("the user looks up the definition of the word '$word'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.looks_for(word);
    }

    @Then("they should see the definition '$definition'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        endUser.should_see_definition(definition);
    }

    @Then("user fail")
    public void userFail(){
        qALightSteps.checkUserFail();
    }

}
