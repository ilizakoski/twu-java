package RomanNumbers;

import java.util.HashMap;
import java.util.Map;

public class RomanNumberConverter {

//    public int convert(String romanNumber) {
//        int result;
//        switch (romanNumber) {
//            case "0":
//                result = 0;
//                break;
//            case "I":
//                result = 1;
//                break;
//            case "II":
//                result = 2;
//                break;
//            case "-I":
//                result = -1;
//                break;
//                default:
//                    result = -1;
//        }
//
//        return result;
//    }

    public int newConvert(String romanNumber) {

        // Map/Hashmap É uma estrutura de dados da lib Collection do Java
        // funciona como um "object": chave, valor. Como um JSON

        Map<String, Integer> romanNumberToNumeral = criaMapa();

        return romanNumberToNumeral.get(romanNumber) != null ? romanNumberToNumeral.get(romanNumber) : -1;
    }

    private Map<String, Integer> criaMapa() {
        Map<String, Integer> romanNumberToNumeral = new HashMap<>();
        romanNumberToNumeral.put("I", 1);
        romanNumberToNumeral.put("II", 2);
        romanNumberToNumeral.put("III", 3);
        romanNumberToNumeral.put("0", 0);
        return romanNumberToNumeral;
    }
}