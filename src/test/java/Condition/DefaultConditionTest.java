package Condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class DefaultConditionTest {

    @Test
    public void shouldMatchDefaultConditionForAll(){
        DefaultCondition defaultCondition = new DefaultCondition();
        assertThat(defaultCondition.match(1), equalTo(true));
        assertThat(defaultCondition.match(2), equalTo(true));
    }

    @Test
    public void shouldReturnStringForCorrespondingNumber(){
        DefaultCondition defaultCondition = new DefaultCondition();
        assertThat(defaultCondition.execute(1), equalTo("1"));
        assertThat(defaultCondition.execute(2), equalTo("2"));
    }
}
