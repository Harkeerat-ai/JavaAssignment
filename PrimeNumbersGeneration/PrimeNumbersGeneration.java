public class PrimeNumbersGeneration{
    public static void main(String[] args){
        int n = 500;
        System.out.println("Prime numbers between 1 and " + n + " are: ");
        for(int i = 1; i <= n; i++){
            boolean isPrime = true;
            for(int j = 2; j <= i/2; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime && i > 1){
                System.out.print(i + " ");
            }
        }
    }
}