import java.util.List;

public class Main {

    public static void main(String[] args){
        FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();
        FizzBuzzPrinter fizzBuzzPrinter = new FizzBuzzPrinter();

        List<String> fizzBuzzList = fizzBuzzGenerator.compute(1,100);
        fizzBuzzPrinter.print(fizzBuzzList);
    }
}
