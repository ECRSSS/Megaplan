package nnglebanov.megaplan.tests;


import nnglebanov.megaplan.task.WomansWay;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomansWayUnitTests {
    @Test
    public void wayTest() {
        Assert.assertEquals(WomansWay.calculate(1000,2),500.0);
        Assert.assertEquals((int)WomansWay.calculate(1000,3),833);
    }
}
