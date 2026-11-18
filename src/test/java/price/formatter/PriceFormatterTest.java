package price.formatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Write your tests for the PriceFormatter here. See the specification of the
 * PriceFormatter and formatPrice method in the PriceFormatter class and the
 * readme file.
 */
public class PriceFormatterTest {

    @Test
    void pistenumerostapois() {
        PriceFormatter formatter = new PriceFormatter();
        assertEquals("0 €", formatter.formatPrice(0.0));
    }

    @Test
    void euroNumeroon() {
        PriceFormatter formatter = new PriceFormatter();
        assertEquals("5 €", formatter.formatPrice(5.0));
        assertEquals("999 €", formatter.formatPrice(999.0));
    }

    @Test
    void ValiNumeroon() {
        PriceFormatter formatter = new PriceFormatter();
        assertEquals("1 000 €", formatter.formatPrice(1000.0));
        assertEquals("1 000 000 €", formatter.formatPrice(1000000.0));
    }

    @Test
    void pilkkulukuun() {
        PriceFormatter formatter = new PriceFormatter();
        assertEquals("12,34 €", formatter.formatPrice(12.34));
    }

    @Test
    void tuopladesimaali() {
        PriceFormatter formatter = new PriceFormatter();
        assertEquals("12,50 €", formatter.formatPrice(12.5));
        assertEquals("0,50 €", formatter.formatPrice(0.5));
    }

    @Test
    void tarkkalukemajavalit() {
        PriceFormatter formatter = new PriceFormatter();
        assertEquals("1 234,50 €", formatter.formatPrice(1234.5));
        assertEquals("123 456,78 €", formatter.formatPrice(123456.78));
    }

    @Test
    void pyoristaaalas() {
        PriceFormatter formatter = new PriceFormatter();
        assertEquals("1,23 €", formatter.formatPrice(1.231));
    }

    @Test
    void pyoristaaylos() {
        PriceFormatter formatter = new PriceFormatter();
        assertEquals("1,24 €", formatter.formatPrice(1.239));
    }

    @Test
    void sievennytsta() {
        PriceFormatter formatter = new PriceFormatter();
        assertEquals("10 €", formatter.formatPrice(10.001));
        assertEquals("20 €", formatter.formatPrice(19.999));
    }

    @Test
    void istoNumerot() {
        PriceFormatter formatter = new PriceFormatter();
        assertEquals("999 999 999,99 €", formatter.formatPrice(999999999.99));
    }
}
