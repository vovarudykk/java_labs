import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class DishesTest {
    private Plate.Size sizeOfPlate = new Plate.Size(0.5, 110);
    private Dishes plate1 = new Plate("Plate1", Material.PORCELAIN, "China", sizeOfPlate);

    @Test
    public void toString_EqualString_True() {
        Assertions.assertEquals("\nName: 'Plate1', Material: porcelain(country of production: France), Producer: China, Size(radius = 5.0мм; deep = 1.1м)'}",
                plate1.toString());
    }
    
    @Test
    public void toString_EqualStringForSize_True() {
        Assertions.assertEquals("Size(radius = 5.0мм; deep = 1.1м)",
                sizeOfPlate.toString());
    }
}
