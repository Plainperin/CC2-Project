package finalactivity;
import java.util.Scanner;
public class FinalActivity {
    static Scanner scan = new Scanner (System.in);
    public static void main(String[] args) {
        facFib();
    }
    
    static void facFib(){
        System.out.println("What do you want to get? factorial/fibonacci?");
        String user = scan.nextLine();
        while ((!user.equals("fibonacci") && (!user.equals("factorial") &&(!user.equals("Factorial") && (!user.equals("Fibonacci")))))){
        System.out.println("What do you want to get? factorial/fibonacci?");
        user = scan.nextLine();
        }
        repeat(user);
    }    
    
    static void repeat(String user){
        switch (user){
            case "factorial":
            case "Factorial": displayFac();
                break;
            case "fibonacci":
            case "Fibonacci": displayFib();
                break;
            
    }    
    }  
    
    static int[] input(){        
        System.out.println("Enter number of elements: ");
        int element = scan.nextInt();
        int [] num1 = new int[element];
        System.out.println("Enter " + element + " integer elements: ");
        for (int i = 0; i < element; i++) {
		num1[i] = scan.nextInt();
    }
        return num1;
    }
               
    static int getFib(int n){
        if (n <= 1){
            return n;
        }else{
            return getFib(n - 1) + getFib(n - 2);
        }
    }
    
    static void displayFib(){
                int a[] = input();
                for (int x = 0; x < a.length; x++){
                    System.out.println("f(" + a[x] + ")" + " = " + getFib(a[x]));
                }
                System.out.print("\n");
    }
    
    static int getFac(int n){
        if (n <= 1){
            return 1;
        }
        else 
            return n*getFac(n-1);  
    }
    
    static void displayFac(){
                int a[] = input();
                for (int x = 0; x < a.length; x++){
                    System.out.println("f(" + a[x] + ")" + " = " + getFac(a[x]));
                }
                System.out.print("\n");
    }
}
 