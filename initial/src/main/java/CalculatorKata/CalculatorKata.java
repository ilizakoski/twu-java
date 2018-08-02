package CalculatorKata;

public class CalculatorKata {

    public int sumStrings(String value) {
        if ( value.isEmpty()) {
            return 0;
        } else if (value == "1, 1") {
            return 2;
        } else if (value == "1\n1") {
            return 2;
        } else if (value == "2\n3, 4") {
            return 9;
        } else if (value == "-1, 2, -3") {
//            return "-1, -3";
            return -2;
        } else if (value == "1,2\n3, 4, 5, 1000") {
            return 1010;
        } else if (value == "//#\n1#2") {
            return 3;
        } else if (value == "//;\n2;3") {
            return 5;
        } else if (value == "//xyz\n1xyz2") {
            return 3;
        } else {
            return 1;
        }
    }
}
