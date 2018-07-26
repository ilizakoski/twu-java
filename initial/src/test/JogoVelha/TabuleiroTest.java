package JogoVelha;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TabuleiroTest {

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
    public void testTabuleiroLimpo() {
        j.inicia();
        for (int lin = 0; lin < 3; lin++) {
            for (int col = 0; col < 3; col++) {
                Assert.assertTrue("deveria estar nulo",
                        j.getTabuleiro()[lin][col].isEmpty());
            }
        }
    }
}
