package BemMeQuer;

public class BemMeQuer {

    public String isQualMeQuer(int numero) {
        if (numero % 2 != 0) {
            return "Mal Me Quer";
        } else {
            return "Bem Me Quer";
        }
    }

    public String objectQualMeQuer(Object numero) {
        if (numero instanceof Integer) {
            return "Testar se é String";
        } else {
            return "Mensagem de erro";
        }
    }
}
