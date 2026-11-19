import java.util.Scanner;

class TwoSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int a[] = new int[size];
        
        for(int i = 0; i < size; i++){
        a[i] = sc.nextInt();
        }
        
        int target = sc.nextInt();
        
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                if (a[i] + a[j] == target){
                System.out.println("["+i+" , "+j+"]");
                }
            }
        }
        sc.close();
    }
}