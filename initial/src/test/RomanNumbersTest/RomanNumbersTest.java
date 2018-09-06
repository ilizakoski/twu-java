package RomanNumbersTest;

import RomanNumbers.RomanNumberConverter;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RomanNumbersTest {

    RomanNumberConverter romanNumberConverter;

    @Before
    public void beforeEach() {
        romanNumberConverter = new RomanNumberConverter();
    }

    @Test
    public void converterSimbolo() {

        int score = romanNumberConverter.newConvert("0");

        assertThat(score, is(0));

    }

    @Test
    public void converterSimboloOne() {

        int score = romanNumberConverter.newConvert("I");

        assertThat(score, is(1));
    }

    @Test
    public void converterSimboloTwo() {

        int score = romanNumberConverter.newConvert("II");

        assertThat(score, is(2));
    }

    @Test
    public void converterSimboloThree() {
        int score = romanNumberConverter.newConvert("III");

        assertThat(score, is(3));
    }

    @Test
    public void converterSimboloDesconhecido() {

        int score = romanNumberConverter.newConvert("-I");

        assertThat(score, is(-1));
    }

    @Test
    public void converterLetraDesconhecido() {

        int score = romanNumberConverter.newConvert("abcdefghi");

        assertThat(score, is(-1));
    }
}
