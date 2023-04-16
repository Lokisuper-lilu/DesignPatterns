import com.superlilu.dao.AbstractDisplay;
import com.superlilu.utils.CharDisplay;
import com.superlilu.utils.StringDisplay;
import org.junit.Test;

public class MyTest {
    @Test
    public void Test_CharDisplay(){
        System.out.println("============");
        AbstractDisplay display=new CharDisplay('6');
        display.display();
        System.out.println("=============");
    }

    @Test
    public void Test_StringDisplay(){
        AbstractDisplay display=new StringDisplay("66666");
        display.display();
    }
}
