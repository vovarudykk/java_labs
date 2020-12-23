import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ServiceTest {
    private Dishes.Size sizeOfPlate1 = new Dishes.Size(20.5, 2);
    private Dishes plate1 = new Plate("Plate1", Material.PORCELAIN, "China", sizeOfPlate1);
    private Service service1 = new Service();


    @Test
    public void addDishes_NotNullService_True() throws Exception {
        this.service1.addDishes(this.plate1);
        ArrayList<Dishes> dishes1 = new ArrayList<>();
        dishes1.add(this.plate1);
        Assertions.assertEquals(dishes1,service1.getDishes());
    }

    @Test
    public void getDish_EqualDish_True() throws Exception {
        this.service1.addDishes(this.plate1);
        Assertions.assertEquals(this.plate1, this.service1.getDish("Plate1"));
    }

    @Test
    public void getDish_NullDish_True() throws Exception {
        Assertions.assertEquals(null, this.service1.getDish("Plate1"));
    }
    
    @Test
    public void toString_EqualString_True() {
        this.service1.addDishes(this.plate1);
        Assertions.assertEquals("Service[\nName: 'Plate1', Material: porcelain(country of production: France), Producer: China, Size(radius = 20.5см; deep = 2.0см)'}]",
                service1.toString());
    }
}
