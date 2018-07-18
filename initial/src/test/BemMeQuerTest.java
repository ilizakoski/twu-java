import BemMeQuer.BemMeQuer;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BemMeQuerTest {

    @Test
    public void retornarBemMeQuerReceberNumero() {

        BemMeQuer bemMeQuer = new BemMeQuer();

        String resultado = bemMeQuer.isBemMeQuer(4);

        assertThat(resultado, is("Bem Me Quer"));
    }
}
