package JogoVelha;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class JogoVelhaTest {

    JogoVelha j;

    @Before
    public void setup() {
        j = new JogoVelha();
    }

    @After
    public void teardown() {
        j = null;
    }

//    @Test
//    public void test() {
//        Assert.fail("nem importo!");
//    }

    @Test
    public void testIniciarJogoCom2Jogadores() {
        j.inicia();
        Assert.assertEquals("deveria ter somente 2 jogadores!", 2, j.getJogadores()
                .size());
    }

    @Test
    public void testIniciarJogoComMenosDe2Jogadores() {
        j.inicia();
        Assert.assertFalse(" ", j.getJogadores().size() < 2);
    }

    @Test
    public void testIniciarJogoComMaisDe2Jogadores() {
        j.inicia();
        Assert.assertFalse(" ", j.getJogadores().size() > 2);
    }

    @Test
    public void testIniciarJogoSemVencedor() {
        j.inicia();
        Assert.assertFalse("não deveria ter um ganhador!", j.temVencedor());
    }

    @Test
    public void testNaoTemVencedor() {
        j.inicia();
        Random r = new Random();
        for (int numJogadas = 1; numJogadas <= 4; numJogadas++) {
            j.marca(numJogadas);
        }
        Assert.assertFalse("Nao deveria ter vencedor!", j.temVencedor());
    }

    @Test
    public void testTemVencedorColuna1() {
        j.inicia();
        j.marca(1);
        j.marca(2);
        j.marca(4);
        j.marca(5);
        j.marca(7);
        Assert.assertTrue("deveria ter vencedor!", j.temVencedor());
    }

    @Test
    public void testTemVencedorColuna2() {
        j.inicia();
        j.marca(2);
        j.marca(1);
        j.marca(5);
        j.marca(3);
        j.marca(8);
        Assert.assertTrue("deveria ter vencedor!", j.temVencedor());
    }

    @Test
    public void testTemVencedorColuna3() {
        j.inicia();
        j.marca(3);
        j.marca(2);
        j.marca(6);
        j.marca(5);
        j.marca(9);
        Assert.assertTrue("deveria ter vencedor!", j.temVencedor());
    }

    @Test
    public void testTemVencedorLinha1() {
        j.inicia();
        j.marca(1);
        j.marca(4);
        j.marca(2);
        j.marca(5);
        j.marca(3);
        Assert.assertTrue("deveria ter vencedor!", j.temVencedor());
    }

    @Test
    public void testTemVencedorLinha2() {
        j.inicia();
        j.marca(4);
        j.marca(1);
        j.marca(5);
        j.marca(3);
        j.marca(6);
        Assert.assertTrue("deveria ter vencedor!", j.temVencedor());
    }

    @Test
    public void testTemVencedorLinha3() {
        j.inicia();
        j.marca(7);
        j.marca(2);
        j.marca(8);
        j.marca(5);
        j.marca(9);
        Assert.assertTrue("deveria ter vencedor!", j.temVencedor());
    }

    @Test
    public void testTemVencedorDiagonal1() {
        j.inicia();
        j.marca(1);
        j.marca(2);
        j.marca(5);
        j.marca(6);
        j.marca(9);
        Assert.assertTrue("deveria ter vencedor!", j.temVencedor());
    }

    @Test
    public void testTemVencedorDiagonal2() {
        j.inicia();
        j.marca(3);
        j.marca(2);
        j.marca(5);
        j.marca(8);
        j.marca(7);
        Assert.assertTrue("deveria ter vencedor!", j.temVencedor());
    }

    @Test
    public void testEmpate() {
        j.inicia();
        j.marca(1);
        j.marca(2);
        j.marca(3);
        j.marca(9);
        j.marca(6);
        j.marca(5);
        j.marca(8);
        j.marca(7);
        j.marca(4);
        Assert.assertTrue("deveria ter vencedor!", j.empate());
    }
}
