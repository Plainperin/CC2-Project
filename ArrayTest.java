package arraytest;

public class ArrayTest {

    public static void main(String[] args) {
       
       int[] array = {3, 9, 15, 20, 65, 23, 18, 4, 2, 14 ,21 , 18, 22};
       int oddCounter = 0,
           evenCounter = 0,
           x;    
       //Get the number of Odd and Even
       for (x = 0; x < array.length; x++){
           if (array[x] % 2 == 0){
               evenCounter++;
           }
           else{
               oddCounter++;
           }
       }
       int[] even = new int[evenCounter],
        odd = new int[oddCounter];
       evenCounter = 0;
       oddCounter = 0;
       
       for (x = 0; x < array.length; x++){
           if (array[x] % 2 == 0){
               even[evenCounter] = array[x];
               evenCounter++;
           }
           else{
               odd[oddCounter] = array[x];
               oddCounter++;
           }
       }
       System.out.print("Array: {");
       
       for(x = 0; x < array.length; x++){
           
           if (x != array.length -1){
               System.out.print(array[x] + ", ");
           }
           else{
               System.out.print(array[x]);
           }
       }
       System.out.println(" }");
       System.out.println("");
       System.out.println("Even\tOdd");
       for(x = 0; x < array.length; x++){
           if (x < even.length){
               System.out.print(even[x] + "\t");
           }else{
               System.out.print("\t");
           }
           if (x < odd.length){
               System.out.print(odd[x] + "\n");
           }else{
               System.out.print("\n");
           }
       }
    }
}
