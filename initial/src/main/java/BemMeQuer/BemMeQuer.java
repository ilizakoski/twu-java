package BemMeQuer;

public class BemMeQuer {

    public String isBemMeQuer(int numero) {
//        if (numero instanceof Integer) {
//            return "Mensagem de erro";
//        }
        if (numero % 2 != 0) {
            return "Mal Me Quer";
        } else {
            return "Bem Me Quer";
        }
    }
}
