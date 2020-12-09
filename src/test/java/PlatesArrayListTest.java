import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.*;

class PlatesArrayListTest {
    private PlatesArrayList plates = new PlatesArrayList();

    @Test
    public void getMaxRadius_Double_MaxRadiusFromList() throws Exception {
        Assertions.assertEquals(plates.getMaxRadius(), 22.0);
    }

    @Test
    public void getSumDeep_Double_SumDeepFromList() throws Exception {
        Assertions.assertEquals(plates.getSumDeep(), 10.6);
    }

    @Test
    public void getAverageRadius_Double_AverageRadiusFromList() throws Exception {
        Assertions.assertEquals(plates.getAverageRadius(), 18.8);
    }

    @Test
    public void getAllPlatesOneProducer_List_allPlatesOfOneMaterial() throws Exception {
        ArrayList<String> lst  = new ArrayList<>();
        Assertions.assertEquals(plates.getAllPlatesOneProducer(Material.CERAMICS, s -> s.getMaterial().equals(Material.CERAMICS))
                .getClass(), lst.getClass());
    }

    @Test
    public void findPlateFromListOfLists_Double_averageValue() throws Exception {
        Assertions.assertEquals(plates.findPlateFromListOfLists(0), 18.8);
        Assertions.assertEquals(plates.findPlateFromListOfLists(1), 19.5);
    }
}
