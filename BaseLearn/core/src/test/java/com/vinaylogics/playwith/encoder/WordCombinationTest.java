package com.vinaylogics.playwith.encoder;

import encoder.WordCombination;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordCombinationTest {
    WordCombination wordCombination;
    char[] data;
    @BeforeEach
    void setUp() {
        wordCombination = new WordCombination();
        data = new char[]{'N','E', 'S', 'T', 'I', 'V'};
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAllCombination() {
        List <String> dataString = wordCombination.getAllCombination(data, 3);
        System.out.println(dataString);
    }
}