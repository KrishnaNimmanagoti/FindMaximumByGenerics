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
    public void compareFirstPosition() {
        Assertions.assertEquals(20, findMaximum.findMax(20, 10, 2));
        Assertions.assertEquals(20, findMaximum.findMax(10, 20, 2));
        Assertions.assertEquals(20, findMaximum.findMax(10, 2, 20));
    }

}
