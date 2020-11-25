import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SaltShakerTest {
    private SaltShaker.Size sizeSH1 = new SaltShaker.Size(1.5, 5);
    private SaltShaker saltShaker1 = new SaltShaker("saltShaker1", Material.GLASS, "China", sizeSH1);

    @Test
    public void addSaltInSH_CountSalt_Double() {
        this.saltShaker1.addSaltInSH(5);
        this.saltShaker1.addSaltInSH(0.5);
        Assertions.assertEquals(saltShaker1.getSaltCount(), 5.5);
    }
}