import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class HandleTest {
    private Handle handle1 = new Handle(Material.STEEL);

    @Test
    public void printData_EqualString_True() throws Exception {
        PrintStream save_out=System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        this.handle1.printData();
        Assertions.assertEquals("Handle material is " + handle1.getMaterial() + "\r\n", out.toString());

        System.setOut(save_out);
    }
}