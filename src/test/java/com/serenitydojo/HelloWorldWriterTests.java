package com.serenitydojo;

import org.junit.jupiter.api.Test;

public class HelloWorldWriterTests {
    @Test
    public void shouldWriteHelloWorldToTheConsole() {
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }
}
