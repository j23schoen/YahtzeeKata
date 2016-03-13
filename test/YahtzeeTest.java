import org.junit.Assert;
import org.junit.Test;

public class YahtzeeTest {



    @Test
    public void onesTests(){
        Assert.assertEquals(2, new Yahtzee(1, 1, 2, 3, 4).ones());
        Assert.assertEquals(0, new Yahtzee(2, 3, 4, 5, 5).ones());
        Assert.assertEquals(4, new Yahtzee(1, 1, 1, 1, 2).ones());
    }

    @Test
    public void twosTests(){
        Assert.assertEquals(4, new Yahtzee(2, 2, 3, 4, 5).twos());
        Assert.assertEquals(8, new Yahtzee(2, 3, 2, 2, 2).twos());
        Assert.assertEquals(0, new Yahtzee(3, 4, 5, 4, 3).twos());
    }

    @Test
    public void threesTests(){
        Assert.assertEquals(6, new Yahtzee(3, 3, 1, 1, 1).threes());
        Assert.assertEquals(12, new Yahtzee(3, 3, 3, 3, 4).threes());
        Assert.assertEquals(0, new Yahtzee(1,2, 4,5, 4).threes());
    }

    @Test
    public void foursTests(){
        Assert.assertEquals(8, new Yahtzee(4, 4, 1, 1, 1).fours());
        Assert.assertEquals(12, new Yahtzee(4, 4, 3, 3, 4).fours());
        Assert.assertEquals(0, new Yahtzee(1,2, 1, 5, 1).fours());
    }

    @Test
    public void fivesTests(){
        Assert.assertEquals(5, new Yahtzee(5, 3, 1, 1, 1).fives());
        Assert.assertEquals(15, new Yahtzee(5, 5, 3, 5, 4).fives());
        Assert.assertEquals(0, new Yahtzee(1,2, 4, 3, 4).fives());
    }

    @Test
    public void sixesTests(){
        Assert.assertEquals(6, new Yahtzee(6, 3, 1, 1, 1).sixes());
        Assert.assertEquals(12, new Yahtzee(3, 3, 6, 3, 6).sixes());
        Assert.assertEquals(0, new Yahtzee(1,2, 4, 5, 4).sixes());
    }
}
