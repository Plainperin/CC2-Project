package twodimensionalinput;
import java.util.Scanner;
    public class TwoDimensionalInput{
        public static void main (String[]args){
            Scanner scan = new Scanner (System.in);
            int row,col;
            System.out.print("Enter number of rows : ");
            row = scan.nextInt();
            int [][] arr = new int [row][0];
            
            for (int x = 0; x < row; x++){
                System.out.println("Enter the number of column on row " + (x+1) + " : ");
                col = scan.nextInt();
                arr[x] = new int[col];
            }
            for (int y = 0; y < row; y++ ){
                for (int z = 0; z < arr[y].length;z++ ){
                    System.out.println ("Enter the element for row " + (y+1) + " ,Column " + (z+1) + " : ");
                    int temp = scan.nextInt();
                    arr[y][z] = temp;
                }
            }
            System.out.println("\n");
            for (int i = 0; i < row; i++){
               for(int n = 0; n < arr[i].length;n++){
                   System.out.print(arr[i][n] + "\t");
             }
               System.out.println("\n");
            }
        }
    }