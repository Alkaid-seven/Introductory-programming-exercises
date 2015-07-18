import java.util.ArrayList;

public class TestDriver{
    public static void main(String args[]){

        Triangle one = new Triangle();
        one.one();
        one.horizontal(8);
        one.vertical(3);
        one.RightTriangle(3);

        Diamond two = new Diamond();
        two.Isosceles(3);
        two.Diamond(3);
        two.DiamondWithName(3);

        FizzBuzzFactors three = new FizzBuzzFactors();
        three.FizzBuzz();
        ArrayList<Integer> PrimeFactors = three.GetFactors(30);
        System.out.print(PrimeFactors);
    }
}