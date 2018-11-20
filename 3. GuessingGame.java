package guessinggame;
import java.util.Scanner;
public class GuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user,rndNum;
        rndNum = (int)(Math.random() * 1000)+1;
        
        System.out.println("Guess the number 1 - 1000: ");
        user = sc.nextInt();
        
        
        while (user != rndNum){
            if (user > 1000 || user < 1){
                System.out.println("Invalid number");
            }
            if (user > rndNum){
            System.out.println("The answer is lower. ");
            }
            if (user < rndNum){
            System.out.println("The answer is higher. ");
            }
            if (rndNum % 2 == 1){
            System.out.println("The number is Odd.");
            }
            if (rndNum % 2 == 0){
            System.out.println("The number is Even.");
            }
           
        System.out.println("Guess the number 1 - 1000: ");
        user = sc.nextInt();
        
        }
        
        System.out.println("");
        System.out.println("GOOOOD JOOOOOB!!!!");
        System.out.println("Correct Answer");
        System.out.println("Your answer is : " + user);
        System.out.println("The random number is : " + rndNum);
    
    }  
    
}
