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
            return "Testar se é String"; //agora tenta escrever um teste que garante que esta parte funciona
        } else {
            return "Mensagem de erro"; //aquele teste está garantindo que esta parte do código funciona
        }
    }
}
