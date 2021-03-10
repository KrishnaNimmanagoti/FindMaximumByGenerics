import com.bridgelabz.generix.FindMaximum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMaximumTest {

    @Test
    public void compareIntegers(){
        Assertions.assertEquals(20, new FindMaximum<>(20, 10, 2).maximum());
        Assertions.assertEquals(20, new FindMaximum<>(10, 20, 2).maximum());
        Assertions.assertEquals(20, new FindMaximum<>(10, 2, 20).maximum());
    }

    @Test
    public void compareFloats(){
        Assertions.assertEquals(20.2f, new FindMaximum<>(20.2f, 10.3f, 2.4f).maximum());
        Assertions.assertEquals(20.2f, new FindMaximum<>(10.3f, 20.2f, 2.4f).maximum());
        Assertions.assertEquals(20.2f, new FindMaximum<>(10.3f, 2.4f, 20.2f).maximum());
    }

    @Test
    public void compareSting(){
        Assertions.assertEquals("Mango", new FindMaximum<>("Mango", "Apple", "Grapes").maximum());
        Assertions.assertEquals("Mango", new FindMaximum<>("Apple", "Mango", "Grapes").maximum());
        Assertions.assertEquals("Mango", new FindMaximum<>("Apple", "Grapes", "Mango").maximum());
    }
}
