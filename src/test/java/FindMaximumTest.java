import com.bridgelabz.generix.FindMaximum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FindMaximumTest {
    FindMaximum findMaximum ;

    @Test
    public void compareIntegers(){
        findMaximum = new FindMaximum(20, 10, 2);
        findMaximum = new FindMaximum(10, 20, 2);
        findMaximum = new FindMaximum(10, 2, 20);
        Assertions.assertEquals(20, findMaximum.maximum());
        Assertions.assertEquals(20, findMaximum.maximum());
        Assertions.assertEquals(20, findMaximum.maximum());
    }

    @Test
    public void compareFloats(){

        findMaximum = new FindMaximum(20.2f, 10.3f, 2.4f);
        findMaximum = new FindMaximum(10.3f, 20.2f, 2.4f);
        findMaximum = new FindMaximum(10.3f, 2.4f, 20.2f);
        Assertions.assertEquals(20.2f, findMaximum.maximum());
        Assertions.assertEquals(20.2f, findMaximum.maximum());
        Assertions.assertEquals(20.2f, findMaximum.maximum());
    }

    @Test
    public void compareSting(){
        findMaximum = new FindMaximum("Mango", "Apple", "Grapes");
        findMaximum = new FindMaximum("Apple", "Mango", "Grapes");
        findMaximum = new FindMaximum("Apple", "Grapes", "Mango");
        Assertions.assertEquals("Mango", findMaximum.maximum());
        Assertions.assertEquals("Mango", findMaximum.maximum());
        Assertions.assertEquals("Mango", findMaximum.maximum());
    }
}
