import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

@RunWith(Parameterized.class)
public class BurgerParametrizedTest {
    private Bun bun;
    private Burger burger;
    private Ingredient ingredient;
    private final String name;
    private final float price;
    private final float totalPrice;


    @Before
    public void createNewBurger() {
        ingredient = new Ingredient(IngredientType.SAUCE, "test", 5.0f);
        burger = new Burger();
    }


    public BurgerParametrizedTest(String name, float price, float totalPrice) {
        this.name = name;
        this.price = price;
        this.totalPrice = totalPrice;
    }
    @Parameterized.Parameters
    public static Object[][] getBurgerData() {
        return new Object[][] {
                {"bigtasty", 100.0f, 205.0f},
                {"bigmak", 200.0f, 405.0f},
                {"bigmak+", 300.0f, 605.0f},
        };
    }
    @Test
    public void getBurgerPrice() {
        bun = new Bun(name, price);
        burger = new Burger();
        burger.addIngredient(ingredient);
       float expected = bun.getPrice() * 2 + ingredient.getPrice();
        Assert.assertEquals(expected, totalPrice, 0);
    }

}