package MaiorTexto;

public class MaiorTexto {

    public String isQualTexto(String[] texto) {
        int aux = 0;
        String maior = "";

        for (int i = 0; i < texto.length; i++) {
            Object obj = texto[i];
            if (obj instanceof String) {
                return "Mensagem de erro";
            } else {
                for (int b = 0; b < texto.length; i++) {
                    if (texto[b].length() > aux) {
                        maior = texto[b];
                    }
                }
            }
            return maior;
        }
        return "Mensagem de erro";
    }
}
