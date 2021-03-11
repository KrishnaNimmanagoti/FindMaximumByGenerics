import com.bridgelabz.generix.FindMaximum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class FindMaximumTest {

    @Test
    public void compare() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        Assertions.assertEquals(5, new FindMaximum(integers).maximum());
    }

    @Test
    public void compareFloats(){
        ArrayList<Float> floats = new ArrayList<>();
        floats.add(20.4f);
        floats.add(35.f);
        floats.add(12.33f);
        floats.add(49.9f);
        floats.add(5.6f);
        Assertions.assertEquals(49.9f, new FindMaximum(floats).maximum());
    }

    @Test
    public void compareSting(){
        ArrayList<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("mango");
        strings.add("grapes");
        strings.add("pineapple");
        strings.add("banana");
        Assertions.assertEquals("pineapple", new FindMaximum(strings).maximum());
    }
}
