package fibonaccitable;
import java.util.Scanner;
public class FibonacciTable {
    public static void main(String[] args) {
        display();
    }
    static int getFib(int n){
        if (n <= 1){
            return n;
        }else{
            return getFib(n - 1) + getFib(n - 2);
        }
    }
    static void display(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value for the fibonacci sequence: ");
        int num = scan.nextInt();
        
        
        if (num == 0){
            System.out.println("0");
        }
        if (num == 1){
            System.out.println("0");
            System.out.println("0 \t 1");
        }
        else{
            for (int a = 0; a <= num; a++){
                System.out.print("F(" + a + ") \t");
            }
            System.out.print("\n");
            
            for (int i = 0; i <= num; i++){
                for (int x = 0; x <= i; x++){
                    System.out.print("|" + getFib(x) + "|" + "\t");
                }
                System.out.print("\n");
            }
        }
        
        
                
    }
}
