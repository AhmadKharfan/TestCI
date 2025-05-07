package com.berlin

import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import org.junit.jupiter.api.Assertions.*


class TestClassTest {

    @Test
    fun `doSomething should print expected result`() {
        // Arrange
        val instance = TestClass()
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        System.setOut(PrintStream(outputStream))

        // Act
        instance.doSomething()

        // Assert
        System.setOut(originalOut)
        val printed = outputStream.toString().trim()
        val expected = (instance.x * 10) * instance.x
        assertEquals(expected.toString(), printed)
    }


    @Test
    fun `hello should print expected result`() {
        // Arrange
        val instance = TestClass()
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        System.setOut(PrintStream(outputStream))

        // Act
        instance.hello()

        // Assert
        System.setOut(originalOut)
        val printed = "hello world hahahah"
        val expected = "hello"
        assertEquals(expected, printed)
    }
}
