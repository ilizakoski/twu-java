package JogoVelha;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class JogadasTest {

    JogoVelha j;

    @Before
    public void setup() {
        j = new JogoVelha();
    }

    @After
    public void teardown() {
        j = null;
    }


    @Test
    public void testJogadaValidaVezJogador() {

        for (int numJogada = 0; numJogada < 9; numJogada++) {
            if (numJogada % 2 == 0)
                Assert.assertTrue("Não deveria ser o O!", j.vezJogador(numJogada, "X"));
            else
                Assert.assertTrue("Não deveria ser o X!", j.vezJogador(numJogada, "O"));
        }

    }

    @Test
    public void testJogadaInvalidaVezJogador() {

        for (int numJogada = 0; numJogada < 9; numJogada++) {
            if (numJogada % 2 == 0)
                Assert.assertFalse("Deveria ser o X!", j.vezJogador(numJogada, "O"));
            else
                Assert.assertFalse("Deveria ser o O !", j.vezJogador(numJogada, "X"));
        }

    }

    @Test
    public void testJogadaPosicaoValidaTabuleiroVazio() {
        j.inicia();
        for (int pos = 1; pos <= 9; pos++) {
            Assert.assertTrue("Deveria ser valida!", j.ehJogadaValida(pos));
        }

    }

    @Test
    public void testJogadaPosicaoInvalidaTabuleiroMarcado() {
        j.inicia();
        for (int pos = 1; pos <= 9; pos++) {
            Assert.assertTrue("Deveria ser valida!", j.ehJogadaValida(pos));
            j.marca(pos);
            Assert.assertFalse("Deveria ser invalida!", j.ehJogadaValida(pos));
        }
    }

    @Test
    public void testIncrementoJogada() {
        j.inicia();
        Random r = new Random();
        Assert.assertEquals("Deveria ser 0.", 0, j.getOrdemDeJogada());
        for (int numJogadas = 1; numJogadas <= 9; numJogadas++) {
            j.marca(r.nextInt(9) + 1);
            System.out.println("Teste incremento: "+j.getOrdemDeJogada());
            Assert.assertEquals("Deveria ser .", numJogadas, j.getOrdemDeJogada());
        }
    }
}
