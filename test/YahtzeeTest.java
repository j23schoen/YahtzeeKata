import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class YahtzeeTest {



    @Test
    public void onesTests(){
        Assert.assertEquals(2, new Yahtzee(1, 1, 2, 3, 4).ones());
        Assert.assertEquals(0, new Yahtzee(2, 3, 4, 5, 5).ones());
        Assert.assertEquals(4, new Yahtzee(1, 1, 1, 1, 2).ones());
    }


}
