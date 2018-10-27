package com.katas;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GreeterTest {
    @Test
    public void should_say_hello() {
        // Arrange
        Greeter greeter = new Greeter("John Doe");

        // Act
        String greeting = greeter.sayHello();

        // Assert
        assertThat(greeting).isEqualTo("Hello, John Doe!");
    }
}
