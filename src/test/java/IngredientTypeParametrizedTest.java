import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;


import org.junit.runners.Parameterized;

import praktikum.IngredientType;

@RunWith(Parameterized.class)
public class IngredientTypeParametrizedTest {
    private final IngredientType ingredient;
    String name;

    public IngredientTypeParametrizedTest(IngredientType ingredient, String name) {
        this.ingredient = ingredient;
        this.name = name;
    }

    @Parameterized.Parameters
    public static Object[][] getEnumData() {
        return new Object[][]{
                {IngredientType.SAUCE, "SAUCE"},
                {IngredientType.FILLING, "FILLING"},
        };
    }

    @Test
    public void getEnumName() {
        assertEquals(ingredient.name(), name);
    }

    @Test
    public void getNameEnum() {
        int expected = 2;
        int actual = IngredientType.values().length;
        assertEquals(expected, actual);
    }
}
