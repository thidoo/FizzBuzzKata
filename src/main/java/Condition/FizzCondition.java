package Condition;

public class FizzCondition implements Condition {

    @Override
    public boolean match(int input) {
        return input % FIZZ == 0;
    }

    @Override
    public String execute(int input) {
        return "Fizz";
    }
}
