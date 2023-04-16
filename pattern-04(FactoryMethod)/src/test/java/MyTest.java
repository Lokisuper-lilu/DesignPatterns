import com.superlilu.framework.Product;
import com.superlilu.idcard.IDCardFactory;
import org.junit.Test;

public class MyTest {
    @Test
    public void Test_IDCardFactory() {
        IDCardFactory factory = new IDCardFactory();
        Product car1 = factory.create("hh");
        Product card2 = factory.create("xcm");
        car1.use();
        card2.use();
        System.out.println(factory.getOwners());
    }
}
