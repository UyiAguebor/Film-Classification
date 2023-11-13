package com.sparta.ua;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AppTest{

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5,6,7,8,9,10,11,12})
    @DisplayName("Check if 12 or under")
    public void check12Under(int age){
        Assertions.assertEquals("U, PG & 12 films are available.",FilmClassifications.availableClassifications(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {15,16,17})
    @DisplayName("Check if 15")
    public void check15(int age){
        Assertions.assertEquals("U, PG, 12 & 15 films are available.",FilmClassifications.availableClassifications(age));
    }

    @ParameterizedTest
    @ValueSource(ints = {18,19,20})
    @DisplayName("Check any age")
    public void checkAny(int age){
        Assertions.assertEquals("All films are available.",FilmClassifications.availableClassifications(age));
    }
}

