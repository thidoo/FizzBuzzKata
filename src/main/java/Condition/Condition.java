package Condition;

public interface Condition {

    final int FIZZ = 3;
    final int BUZZ = 5;

    boolean match(int input);

    String execute(int input);
}
