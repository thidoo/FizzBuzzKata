package Condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzConditionTest {

    @Test
    public void shouldMatchFizzConditionForMultiplesOf3(){
        FizzCondition fizzCondition = new FizzCondition();
        assertThat(fizzCondition.match(3), equalTo(true));
        assertThat(fizzCondition.match(5), equalTo(false));
    }

    @Test
    public void shouldReturnFizzStringForMultiplesOf3(){
        FizzCondition fizzCondition = new FizzCondition();
        assertThat(fizzCondition.execute(3), equalTo("Fizz"));
        assertThat(fizzCondition.execute(6), equalTo("Fizz"));
    }

}
