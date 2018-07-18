import BemMeQuer.BemMeQuer;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BemMeQuerTest {

    @Test
    public void retornarBemMeQuerReceberNumero() {

        retornarResultado(4, "Bem Me Quer");
        retornarResultado(5, "Mal Me Quer");
        retornarResultadoObject(12345, "Testar se é String");
    }

    private void retornarResultado (int numero, String mensagem) {

        BemMeQuer bemMeQuer = new BemMeQuer();

        String resultado = bemMeQuer.isQualMeQuer(numero);

        assertThat(resultado, is(mensagem));
    }

    private void retornarResultadoObject(int numero, String mensagem) {

        BemMeQuer bemMeQuer = new BemMeQuer();

        String resultado = bemMeQuer.objectQualMeQuer(numero);

        assertThat(resultado, is(mensagem));
    }
}
