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

    @Test
    public void onePairTest(){
        Assert.assertEquals(8, new Yahtzee(3, 3, 3, 4, 4).pairs());
        Assert.assertEquals(10, new Yahtzee(5, 5, 4, 2, 2).pairs());
        Assert.assertEquals(12, new Yahtzee(6, 4, 3, 4, 6).pairs());
    }

    @Test
    public void twoPairTest(){
        Assert.assertEquals(8, new Yahtzee(1, 1, 2, 3, 3).twoPairs());
        Assert.assertEquals(14, new Yahtzee(4, 4, 2, 3, 3).twoPairs());
        Assert.assertEquals(0, new Yahtzee(4, 3, 2, 2, 1).twoPairs());
    }

    @Test
    public void threeOfAKindTest(){
        Yahtzee game = new Yahtzee();
        Assert.assertEquals(12, game.threeOfAKind(4, 4, 4, 5, 5));
        Assert.assertEquals(15, game.threeOfAKind(5, 4, 5, 1, 5));
    }

    @Test
    public void fourOfAKindTest(){
        Yahtzee game = new Yahtzee();
        Assert.assertEquals(4, game.fourOfAKind(1, 2, 1, 1, 1));
        Assert.assertEquals(8, game.fourOfAKind(2, 5, 2, 2, 2));
    }

    @Test
    public void smallStraightTest(){
        Assert.assertEquals(15, new Yahtzee(1, 2, 3, 4, 5).smallStraight());
        Assert.assertEquals(0, new Yahtzee(1, 2, 3, 3, 4).smallStraight());
        Assert.assertEquals(0, new Yahtzee(1, 2, 3, 4, 6).smallStraight());
    }

    @Test
    public void largeStraightTest(){
        Assert.assertEquals(20, new Yahtzee(2, 3, 4, 5, 6).largeStraight());
        Assert.assertEquals(0, new Yahtzee(1, 2, 3, 4, 5).largeStraight());
        Assert.assertEquals(20, new Yahtzee(3, 4, 5, 6, 2).largeStraight());
    }

    @Test
    public void fullHouseTest(){
        Yahtzee game = new Yahtzee();
        Assert.assertEquals(18, game.fullHouse(6, 2, 2, 2, 6));
        Assert.assertEquals(0, game.fullHouse(1, 2, 3, 4, 5));
    }
}
