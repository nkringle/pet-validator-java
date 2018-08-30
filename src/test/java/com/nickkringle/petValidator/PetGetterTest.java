package com.nickkringle.petValidator;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PetGetterTest {

    @Before
    public void beforeAll() {

    }

    @Test
    public void shouldTestSomething() {
        assertEquals("cat", "dog");
    }

    @Test
    public void run() throws IOException, UnirestException {
        PetGetter cats = new PetGetter();
        String randomdes = cats.getRandomString();
        System.out.print(randomdes);
        assertTrue(randomdes.length() > 0);
    }
}
