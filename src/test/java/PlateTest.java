import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlateTest {
    private Plate.Size sizeOfPlate1 = new Plate.Size(20.5, 2);
    private Plate plate1 = new Plate("Plate1", Material.PORCELAIN, "China", sizeOfPlate1);

    @Test
    public void DishesException_EqualException_True() throws Exception {
        try{
            Plate plate2 = new Plate(12, Material.PORCELAIN, "China", sizeOfPlate1);
            throw new DishesException("Incorrect type of name", plate2);
        }
        catch(DishesException de){
            Assertions.assertEquals("Incorrect type of name", de.getMessage());
        }
    }
}
