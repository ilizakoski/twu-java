package BowlingKata;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BowlingKataTest {

    BowlingKata bowlingGame;

    @Before
    public void beforeEach() {
         bowlingGame = new BowlingKata();
    }

    @Test
    public void givenThatYouMissAllPinsYouScoreZero() { // ok

        rollMany(20, 0);

        int score = bowlingGame.getScore();

        assertThat(score, is(0));
    }

    @Test
    public void knockingDownOnePinWithEachBallScoresTwenty(){ //ok

        rollMany(20, 1);

        int score = bowlingGame.getScore();

        assertThat(score, is(20));
    }

    @Test
    public void spareFirstFrameWithThreePinsByAllMissesSixteen() { //ok

        rollSpare();
        bowlingGame.roll(3);
        rollMany(17, 0);

        int score = bowlingGame.getScore();

        assertThat(score, is(16));
    }

    @Test
    public void strikeFirstFrameWithThreeAndFourPinsByAllMissesTwentyFour() { //ok

        rollStrike();
        bowlingGame.roll(3);
        bowlingGame.roll(4);
        rollMany(16, 0);

        int score = bowlingGame.getScore();

        assertThat(score, is(24));
    }

    @Test
    public void strikePerfectByThreeHundred() {

        rollMany(12, 10);

        int score = bowlingGame.getScore();

        assertThat(score, is(300));
    }

    private void rollStrike() {
        bowlingGame.roll(10);
    }

    private void rollSpare() {
        bowlingGame.roll(5);
        bowlingGame.roll(5);
    }

    private void rollMany(int rolls, int pins) {
        for (int i = 0; i < rolls; i++)
            bowlingGame.roll(pins);
    }
}