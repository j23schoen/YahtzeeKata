import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class YahtzeeTest {

    Yahtzee game;

    @Before
    public void setUp(){
       game = new Yahtzee();
    }

    @Test
    public void onesTests(){
        Assert.assertEquals(2, game.ones(1, 1, 2, 3, 4));
    }


}
