import Condition.BuzzCondition;
import Condition.DefaultCondition;
import Condition.FizzBuzzCondition;
import Condition.FizzCondition;
import Condition.Condition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzzGenerator {

    public List<String> compute(int start, int end) {

        List<Condition> conditions = Arrays.asList(
                new FizzBuzzCondition(),
                new FizzCondition(),
                new BuzzCondition(),
                new DefaultCondition()
        );

        List<String> resultList = new ArrayList<>();
        IntStream.range(start, end+1).forEach((input) -> {
            resultList.add(conditions.stream().filter(condition -> condition.match(input))
                                .findFirst()
                                .get()
                                .execute(input));
        });

        return resultList;
    }
}
