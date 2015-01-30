package org.subins.webmvc.controller;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "classpath:features", format = { "pretty", "html:target/cucumber" })
public class AppTest {

}
