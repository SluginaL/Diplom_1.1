import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;



public class IngredientTest {
    private Ingredient ingredient;

    @Before
    public void setUp() {
        ingredient = new Ingredient(IngredientType.SAUCE, "cesar", 10.4f);
    }


    @Test
    public void getName() {
        String expected = "cesar";
        Assert.assertEquals(expected, ingredient.getName());
    }

    @Test
    public void getPrice() {
        float expected = 10.4f;
        Assert.assertEquals(expected, ingredient.getPrice(), 0);
    }
    @Test
    public void getType() {
        String expected = "SAUCE";
        Assert.assertEquals(expected, IngredientType.SAUCE.toString());
    }

}