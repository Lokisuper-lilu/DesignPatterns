import com.superlilu.confreader.Configuration;
import org.junit.Test;

public class MyTest {
    @Test
    public void Test_Singleton() {
        Configuration conf1 = Configuration.getConfiguration();
        Configuration conf2 = Configuration.getConfiguration();
        //conf1和conf2是同一个实例(单例构造)
        System.out.println(conf1 == conf2);
    }
}
