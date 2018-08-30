package com.nickkringle.petValidator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PetVerifierTest {

    PetVerifier classUnderTest;

    @Before
    public void before() {
        classUnderTest = new PetVerifier();
    }

    @Test
    public void shouldTestSomething() {
        assertEquals("cat", "dog");
    }

    @Test
    public void shouldHelloWorld(){
        String expected = "Hello, world!";

        assertEquals(expected, classUnderTest.HelloWorld());
    }

}
