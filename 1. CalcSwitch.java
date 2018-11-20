package calcswitch;
import java.util.*;
public class CalcSwitch {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double userNum, userNum2;
        String userString;
       
        System.out.println("Enter 1st Number: ");
        userNum = input.nextDouble();
        
        System.out.println("Enter 2nd Number: ");
        userNum2 = input.nextDouble();
        
        System.out.println("Enter the arithmetic operator:| + | - | * | / | % | Add | Subtract "
                + "| Multiply | Divide | Modulo |");
        userString = input.next();
        
        
        switch (userString){
            case "+":
                
            case "Add":
                    System.out.println("Answer is: " + (userNum + userNum2));
                    break;
                    
                case "-":
                
                case "Subtract":
                    System.out.println("Answer is: " + (userNum - userNum2));
                    break;
                
            case "*":
                
            case "Multiply":
                    System.out.println("Answer is: " + (userNum * userNum2));
                break;
                
            case "/":
                
            case "Divide":
                    System.out.println("Answer is: " + (userNum / userNum2));
                break;
                
            case "%":
               
            case "Modulo":
                    System.out.println("Answer is: " + (userNum % userNum2));
                
                break;
                
            default:
                System.out.println("Invalid");
                
                                
            
    
        } 
    }
}
