package com.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceTest {

    private Service service;

    @BeforeEach
    void setUp() {
        service = new Service(); // Setup
        System.out.println("Setting up before test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up after test");
    }

    @Test
    void testMultiply() {
        // Arrange
        int a = 3;
        int b = 4;

        // Act
        int result = service.multiply(a, b);

        // Assert
        assertEquals(12, result);
    }

    @Test
    void testIsPositiveTrue() {
        // Arrange
        int number = 5;

        // Act
        boolean result = service.isPositive(number);

        // Assert
        assertTrue(result);
    }

    @Test
    void testIsPositiveFalse() {
        // Arrange
        int number = -3;

        // Act
        boolean result = service.isPositive(number);

        // Assert
        assertFalse(result);
    }
}
