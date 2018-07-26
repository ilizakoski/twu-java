import MaiorTexto.MaiorTexto;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MaiorTextoTest {

    @Test
    public void retornarTexto() {

        String[] data = {"Batata", "Batatão", "Batata-Gigante", "Batata Mega Hiper Blaster Chuck Norris"};

        retornarResultado(data, "Mensagem de erro");
    }

    private void retornarResultado(String[] texto, String mensagem) {

        MaiorTexto maiorTexto = new MaiorTexto();

        String resultado = maiorTexto.isQualTexto((texto));

        assertThat(resultado, is(mensagem));
    }
}
