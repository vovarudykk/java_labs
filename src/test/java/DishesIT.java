import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class DishesIT {
    private Plate.Size sizeOfPlate = new Plate.Size(0.5, 110);
    private SizeConvertor obj = new SizeConvertor();

    @Test
    public void convertSize_CorrectReturn_True() {
        SizeConvertor mock_obj = Mockito.mock(SizeConvertor.class);
        Mockito.when(mock_obj.smToMm(sizeOfPlate.getRadius(), sizeOfPlate.getDeep())).thenReturn("radius = 5.0мм; deep = 1.1м");
        sizeOfPlate.convertSize(mock_obj);
        Assertions.assertEquals(sizeOfPlate.convertSize(obj), "radius = 5.0мм; deep = 1.1м");
        Mockito.verify(mock_obj).smToMm(sizeOfPlate.getRadius(), sizeOfPlate.getDeep());
    }
    
    @Test
    public void convertSize_CorrectReturnBySpy_True() {
        SizeConvertor spy_obj = Mockito.spy(SizeConvertor.class);
        Mockito.when(spy_obj.smToMm(sizeOfPlate.getRadius(), sizeOfPlate.getDeep())).thenReturn("radius = 5.0мм; deep = 1.1м");
        sizeOfPlate.convertSize(spy_obj);
        Assertions.assertEquals(sizeOfPlate.convertSize(obj), "radius = 5.0мм; deep = 1.1м");
        Mockito.verify(spy_obj).smToMm(sizeOfPlate.getRadius(), sizeOfPlate.getDeep());
    }
}
