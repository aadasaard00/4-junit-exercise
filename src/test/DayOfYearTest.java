package refactoring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DayOfYearTest {
    
    @Test
    void esimmainenpaivaonyksi() {
        assertEquals(1, DayOfYear.dayOfYear(1, 1, 2023));
    }

    @Test
    void tammikuunvikapaiva() {
        assertEquals(31, DayOfYear.dayOfYear(1, 31, 2023));
    }

    @Test
    void ensimmainenpaivahelmikuuta() {
        assertEquals(32, DayOfYear.dayOfYear(2, 1, 2023));
    }

    @Test
    void karkaus() {
        assertEquals(59, DayOfYear.dayOfYear(2, 28, 2023));
    }

    @Test
    void ensimmainenpaivamaaliskuu() {
        assertEquals(60, DayOfYear.dayOfYear(3, 1, 2023));
    }

    @Test
    void karkausta() {
        assertEquals(365, DayOfYear.dayOfYear(12, 31, 2023));
    }

    @Test
    void helmikuuta() {
        assertEquals(60, DayOfYear.dayOfYear(2, 29, 2024));
    }

    @Test
    void maaliskuuta() {
        assertEquals(61, DayOfYear.dayOfYear(3, 1, 2024));
    }

    @Test
    void karkausvuosi() {
        assertEquals(366, DayOfYear.dayOfYear(12, 31, 2024));
    }

    @Test
    void vuosiluku() {
        assertEquals(60, DayOfYear.dayOfYear(3, 1, 1900));
    }

    @Test
    void vuosilukujatkuu() {
        assertEquals(61, DayOfYear.dayOfYear(3, 1, 2000));
    }

    @Test
    void kuukausisaanto() {
        assertThrows(IllegalArgumentException.class, () -> DayOfYear.dayOfYear(0, 1, 2023));
    }

    @Test
    void kuukausisaantoja() {
        assertThrows(IllegalArgumentException.class, () -> DayOfYear.dayOfYear(13, 1, 2023));
    }

    @Test
    void paivasaanto() {
        assertThrows(IllegalArgumentException.class, () -> DayOfYear.dayOfYear(1, 0, 2023));
    }

    @Test
    void karkauslisa() {
        assertThrows(IllegalArgumentException.class, () -> DayOfYear.dayOfYear(2, 30, 2023));
    }

    @Test
    void huhtikuu() {
        assertThrows(IllegalArgumentException.class, () -> DayOfYear.dayOfYear(4, 31, 2023));
    }
}


