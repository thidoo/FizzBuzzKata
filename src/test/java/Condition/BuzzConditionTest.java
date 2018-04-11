package Condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class BuzzConditionTest {

    @Test
    public void shouldMatchFizzBuzzConditionForMultiplesOf3And5(){
        FizzBuzzCondition fizzBuzzCondition = new FizzBuzzCondition();
        assertThat(fizzBuzzCondition.match(15), equalTo(true));
        assertThat(fizzBuzzCondition.match(12), equalTo(false));
    }

    @Test
    public void shouldReturnFizzBuzzStringForMultiplesOf3And5(){
        FizzBuzzCondition fizzBuzzCondition = new FizzBuzzCondition();
        assertThat(fizzBuzzCondition.execute(15), equalTo("FizzBuzz"));
        assertThat(fizzBuzzCondition.execute(30), equalTo("FizzBuzz"));
    }
}
