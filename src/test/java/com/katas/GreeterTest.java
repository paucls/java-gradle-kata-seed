package com.katas;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GreeterTest {

    @Test
    public void greeter_should_say_hello() throws Exception {
        // Arrange
        Greeter greeter = new Greeter("John Doe");

        // Act
        String greeting = greeter.sayHello();

        // Assert
        assertThat(greeting, is("Hello, John Doe!"));
    }

}
