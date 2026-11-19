import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        int n = sc.nextInt();

        System.out.println("Primes numbers are:");

        for(int num= 2; num <= n; num++) {
            boolean isPrime=true;

            for(int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(num+ ",");
            }
        }
    }
}