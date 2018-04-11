package Condition;

public class BuzzCondition implements Condition {

    @Override
    public boolean match(int input) {
        return input % BUZZ == 0;
    }

    @Override
    public String execute(int input) {
        return "Buzz";
    }
}
