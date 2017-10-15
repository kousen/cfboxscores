package com.oreilly;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.*;

public class GamePageParserTest {
    private GamePageParser parser = new GamePageParser();

    @Test
    public void getGames() {
        parser.printGames(LocalDate.of(2017, Month.MAY, 5), 3);
    }
}