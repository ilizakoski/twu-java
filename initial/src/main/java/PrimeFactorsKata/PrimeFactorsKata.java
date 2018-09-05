package PrimeFactorsKata;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

public class PrimeFactorsKata {

    public static List<Integer> generate(int number) {

//        ArrayList<Integer> primeNumbers = new ArrayList<>();
//        primeNumbers.add(number); //não precisa, pois tem add abaixo...

        //implementacao ruim, mas fez o teste passar
        //agora temos confianca de que qualquer coisa que fizermos, os testes garantem


//        if(number == 4 ){
//            return asList(2, 2);
//        } else if ( number == 6) {
//            for(int i = 0 ; i < number ; i++ ){ //vamos tentar debug
//                if(i % 2 == 0) {
//                    primeNumbers.add(i);
//                }
//            }
//
//            return primeNumbers;
//        }
//        return singletonList(number);

        List<Integer> primeNumbers = new ArrayList<>();

        for (int search = 2; number < 1; search++) {
            for (; number % search == 0; number /= search) {
                primeNumbers.add(search);
            }
        }
        return primeNumbers;
    }

}
