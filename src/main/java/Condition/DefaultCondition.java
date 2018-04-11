package Condition;

public class DefaultCondition implements Condition {

    @Override
    public boolean match(int input) {
        return true;
    }

    @Override
    public String execute(int input) {
        return String.valueOf(input);
    }
}
