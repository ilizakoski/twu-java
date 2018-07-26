import BemMeQuer.BemMeQuer;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BemMeQuerTest {

    //agora tu tem 4 testes, testando toda a logica da tua implementacao
    //e ficou bem claro pelos nomes o que a tua aplicacao faz.

    @Test
    public void dadoQueNumeroParRetornaBemMeQuer() { //givenNumberIsPairReturnsBemMeQuer
        retornarResultado(4, "Bem Me Quer");
    }

    @Test
    public void dadoQueNumeroImparRetornaMalMeQuer() {
        retornarResultado(5, "Mal Me Quer");
    }

    @Test
    public void dadoQueTipoEStringRetornaMensagemDeErro() {
        retornarResultadoObject("abcde", "Mensagem de erro");
    }

    @Test
    public void dadoQueTipoNaoEStringRetornaMensagemDeSucesso() {
//        retornarResultadoObject(1, "Testar se é String")

    //cenário do teste - before
    BemMeQuer bemMeQuer = new BemMeQuer();

    //ação do teste: método que tu quer testar
    String resultado = bemMeQuer.objectQualMeQuer(111);

    //expect
    assertThat(resultado, is("Testar se é String"));

    }

    private void retornarResultado (int numero, String mensagem) {

        BemMeQuer bemMeQuer = new BemMeQuer();

        String resultado = bemMeQuer.isQualMeQuer(numero);

        assertThat(resultado, is(mensagem));
    }

    private void retornarResultadoObject(String numero, String mensagem) {

        BemMeQuer bemMeQuer = new BemMeQuer();

        String resultado = bemMeQuer.objectQualMeQuer(numero); //ele recebe uma string ou int?

        assertThat(resultado, is(mensagem));
    }
}
