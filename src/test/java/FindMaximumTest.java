import com.bridgelabz.generix.FindMaximum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FindMaximumTest {
    FindMaximum findMaximum ;

    @BeforeEach
    public void setUp(){
        findMaximum = new FindMaximum();
    }

    @Test
    public void compareIntegers(){
        Assertions.assertEquals(20, findMaximum.findMaxInteger(20, 10, 2));
        Assertions.assertEquals(20, findMaximum.findMaxInteger(10, 20, 2));
        Assertions.assertEquals(20, findMaximum.findMaxInteger(10, 2, 20));
    }

    @Test
    public void compareFloats(){
        Assertions.assertEquals(20.2f, findMaximum.findMaxFloat(20.2f, 10.3f, 2.4f));
        Assertions.assertEquals(20.2f, findMaximum.findMaxFloat(10.3f, 20.2f, 2.4f));
        Assertions.assertEquals(20.2f, findMaximum.findMaxFloat(10.3f, 2.4f, 20.2f));
    }

}
