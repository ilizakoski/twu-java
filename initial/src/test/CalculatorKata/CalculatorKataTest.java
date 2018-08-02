package CalculatorKata;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CalculatorKataTest {

    CalculatorKata calculatorKata;

    @Before
    public void before() {
        calculatorKata = new CalculatorKata(); //arrange
    }

    @Test
    public void givenEmptyStringReturnsZero() {

        int result = calculatorKata.sumStrings(""); //act

        assertThat(result, is(0)); // assert
    }

    @Test
    public void givenOneAsStringReturnsOneAsInt() {

        int result = calculatorKata.sumStrings("1");

        assertThat(result, is(1));
    }

    @Test
    public void givenOnePlusOneAsStringReturnsTwoAsInt() {

        int result = calculatorKata.sumStrings("1, 1");

        assertThat(result, is(2));
    }

    @Test
    public void givenOnePlusOneAsStringWithNewLineReturnsTwoAsInt() {

        int result = calculatorKata.sumStrings("1\n1");

        assertThat(result, is(2));
    }

    @Test
    public void givenTwoPlusThreePlusFourAsStringWithDelimitedReturnsNineAsInt() {

        int result = calculatorKata.sumStrings("2\n3, 4");

        assertThat(result, is(9));
    }

    @Test
    public void givenNegativeOnePlusTwoPlusNegativeThreeAsStringReturnNegativeAsInt() {

        int result = calculatorKata.sumStrings("-1, 2, -3");

//        assertThat(result, is("-1, -3"));
        assertThat(result, is(-2));
    }

    @Test
    public void givenOnePlusTwoPlusThreePlusFourPlusFivePlusThousandAsStringReturnIgnoredAsInt() {

        int result = calculatorKata.sumStrings("1,2\n3, 4, 5, 1000");

        assertThat(result, is(1010));
    }

    @Test
    public void givenOnePlusTwoAsStringReturnThreeAndFiveAsInt() {

        int result = calculatorKata.sumStrings("//#\n1#2");
        int result1 = calculatorKata.sumStrings("//;\n2;3");

        assertThat(result, is(3));
        assertThat(result1, is(5));
    }
}
