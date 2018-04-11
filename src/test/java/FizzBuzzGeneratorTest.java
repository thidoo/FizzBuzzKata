import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class FizzBuzzGeneratorTest {

    @Test
    public void shouldReturnValidFizzBuzzList(){
        FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();
        List<String> actual = fizzBuzzGenerator.compute(1, 15);
        List<String> expected = Arrays.asList(new String[]{"1", "2", "Fizz", "4", "Buzz",
                                                            "Fizz", "7", "8", "Fizz", "Buzz",
                                                            "11", "Fizz", "13", "14", "FizzBuzz"});

        assertThat(actual, equalTo(expected));
    }
}
