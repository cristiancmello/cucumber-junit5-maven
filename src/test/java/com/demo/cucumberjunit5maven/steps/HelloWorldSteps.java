package com.demo.cucumberjunit5maven.steps;

import com.demo.cucumberjunit5maven.CucumberBootstrap;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

import static org.assertj.core.api.Assertions.*;

@Slf4j
public class HelloWorldSteps extends CucumberBootstrap {
    @Given("system output")
    public void given_systemoutput() {
        assertThat(true).isTrue();
    }

    @When("enviada mensagem para System output 'Hello World'")
    public void when_enviada_mensagem_systemoutput() {
        assertThat(true).isTrue();
    }

    @Then("a mensagem deve aparecer na tela")
    public void then_deve_mensagem_aparecer_tela() {
        assertThat(true).isTrue();
    }
}
