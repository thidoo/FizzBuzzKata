package Condition;

public class FizzBuzzCondition implements Condition {

    @Override
    public boolean match(int input) {
        return input % FIZZ == 0 && input % BUZZ == 0;
    }

    @Override
    public String execute(int input) {
        return "FizzBuzz";
    }
}
