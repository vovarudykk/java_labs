import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SizeConvertorTest {
    private SizeConvertor obj = new SizeConvertor();

    @Test
    public void smToMm_EqualString_True() throws Exception {
        Assertions.assertEquals(obj.smToMm(0.5, 110), "radius = 5.0мм; deep = 1.1м");
    }
}
