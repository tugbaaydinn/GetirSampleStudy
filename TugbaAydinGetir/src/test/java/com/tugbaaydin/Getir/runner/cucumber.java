package com.tugbaaydin.Getir.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(features = "classpath:features",
            plugin = {"json:target/cucumber.json"},
            glue = "com.tugbaaydin.Getir.test")

    public class cucumber {
    }
