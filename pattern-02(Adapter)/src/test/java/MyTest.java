import com.superlilu.inheritAdapter.dao.Print;
import com.superlilu.inheritAdapter.utils.PrintBanner;
import com.superlilu.pojo.Banner;
import org.junit.Test;

public class MyTest {
    @Test
    public void Test_InheritAdapterPrintBanner() {
        Print p = new PrintBanner("Hello Design Pattern");
        p.printStrong();
        p.printWeak();

    }

    @Test
    public void Test_ObjectAdapterPrintBanner() {
        Banner banner = new Banner("Hello Design Pattern");
        com.superlilu.objectAdapter.dao.Print p =
                new com.superlilu.objectAdapter.utils.PrintBanner(banner);
        p.printStrong();
        p.printWeak();
    }
}
