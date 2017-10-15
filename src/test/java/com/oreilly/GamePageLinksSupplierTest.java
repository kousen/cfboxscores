package com.oreilly;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static org.junit.Assert.*;

public class GamePageLinksSupplierTest {
    private LocalDate date = LocalDate.of(2017, Month.MAY, 5);
    private GamePageLinksSupplier supplier = new GamePageLinksSupplier(date, 3);

    @Test
    public void getGamePageLinks() {
        List<String> singleDayGames = supplier.getGamePageLinks(date);
        assertEquals(15, singleDayGames.size());
        singleDayGames.forEach(link ->
                assertTrue(link.startsWith("gid_2017_05_05_")));
    }

    @Test
    public void get() {
        List<String> threeDaysGames = supplier.get();
        assertEquals(45, threeDaysGames.size());
        threeDaysGames.forEach(s ->
                assertTrue(s.startsWith("gid_2017_05_05_") ||
                        s.startsWith("gid_2017_05_06_") ||
                        s.startsWith("gid_2017_05_07_")));
    }
}