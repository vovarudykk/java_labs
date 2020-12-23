import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import java.util.ArrayList;

class MaterialTest {
    @Test
    public void getCountryOfProduction_SimilarCounty_True() throws Exception {
        Assertions.assertEquals("France", Material.PORCELAIN.getCountryOfProduction());
    }

    @Test
    public void getStringAll_EqualString_True() {
        Assertions.assertEquals("We have 4 kinds of materials:\nporcelain; glass; ceramics; steel; ", Material.getStringAll());
    }
    
    @Test
    public void toString_EqualString_True() {
        Assertions.assertEquals("Material: glass(country of production: Ukraine)", Material.GLASS.toString());
    }
}
