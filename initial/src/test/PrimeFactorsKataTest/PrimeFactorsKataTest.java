package PrimeFactorsKataTest;

import PrimeFactorsKata.PrimeFactorsKata;
import org.junit.Test;

import static java.util.Collections.singletonList;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class PrimeFactorsKataTest {
    @Test
    public void AListWithNumberOneShouldReturnNull() {
//        assertEquals(singletonList(1), PrimeFactorsKata.generate(0));

        assertThat(PrimeFactorsKata.generate(1), is(list()));
    }

    @Test
    public void AListWithNumberTwoShouldReturnTwo() {
//        assertEquals(singletonList(2), PrimeFactorsKata.generate(2));

        assertThat(PrimeFactorsKata.generate(2), is(list(2)));
    }

    @Test
    public void AListWithNumberThreeShouldReturnThree() {

//        assertEquals(singletonList(3), PrimeFactorsKata.generate(3));
    }

    @Test
    public void AListWithNumberFourSlouldReturnTwoAndTwo() {
        //o método singletonList() so recebe um argumento
        //o método asList recebe mais

//        assertEquals(asList(2, 2), PrimeFactorsKata.generate(4));
    }

    @Test
    public void AListWithNumberSixSlouldReturnTwoAndThree() {

//        assertEquals(asList(2, 3), PrimeFactorsKata.generate(6));
    }

    private List<Integer> list(int...ints) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i : ints) {
            list.add(i);
        }
        return list;
    }
}
