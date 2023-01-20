import org.junit.Before;
import org.junit.Test;
import praktikum.Bun;
import org.junit.Assert;


public class BunTest {

    private Bun bun;

    @Before
    public void setUp() {
        bun = new Bun("bigtasty", 13.2f);
    }

    @Test
    public void returnName() {
        String expected = "bigtasty";
        Assert.assertEquals(expected, bun.getName());
    }

    @Test
    public void returnPrice() {
        float expected = 13.2f;
        Assert.assertEquals(expected, bun.getPrice(), 0);
    }


}
