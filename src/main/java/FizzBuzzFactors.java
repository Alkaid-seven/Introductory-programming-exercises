import java.util.ArrayList;

public class FizzBuzzFactors{
    void FizzBuzz(){
        for(int i=1; i<=100; i++){
            String OutPutFizzBuzz;
            if(i%15==0){
                OutPutFizzBuzz="FizzBuzz";
            }else if(i%3==0){
                OutPutFizzBuzz="Fizz";
            }else if(i%5==0){
                OutPutFizzBuzz="Buzz";
            }else{
                OutPutFizzBuzz=Integer.toString(i);
            }
            System.out.println(OutPutFizzBuzz);
        }
    }

    public static ArrayList<Integer> GetFactors(int n){
        if(n==1){
            return null;
        }
        ArrayList<Integer> FactorsList = new ArrayList<Integer>();
        while(n%2==0){
            n = n/2;
            FactorsList.add(2);
        }
        for(int i=3; i<=n; i++){
            while(n%i==0){
                n=n/i;
                FactorsList.add(i);
            }
        }
        return FactorsList;
    }
}