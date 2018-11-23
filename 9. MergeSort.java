package mergeSort;
import java.util.Scanner;
public class MergeSort {

	public static void sort(int[] z, int low, int high) {
		
		/*Merge sort is a sorting technique based on divide and conquer technique
		 * With worst case time complexity being O( n log n ), it is one of the most
		 * respected algorithms.
		 * 
		 * Merge sort first divides the array into equal halves and then combines them
		 * in a sorted manner.
		 * 
		 * 
		 * Algorithm:
		 * Merge sort keeps dividing the list into equal halves until it can no more be
		 * divided. By definition, if it is only one element on the list, it is sorted.
		 * Then, merge sort combines the smaller sorted lists keeping the new list sorted too.
		 * 
		 * Step 1: If it is only one element in the list it is already sorted, return.
		 * Step 2: Divide the list recursively into two halves until it can no more
		 * be divided.
		 * Step 3: Merge the smaller lists into new list in sorted order.
		 * 
		 */
		
		int num = high - low;
		if (num <= 1)
			return;
		int mid = low + num/2;
		
		//recursive sort
		sort(z, low, mid);
		sort(z, mid, high);
		
		//merge two sorts
		int[] temp = new int[num];
		int i = low, j = mid;
		
		for (int x = 0; x < num; x++) {
			if (i == mid)
				temp[x] = z[j++];
			else if (j == high)
				temp[x] = z[i++];
			else if (z[j] < z[i])
				temp[x] = z[j++];
			else
				temp[x] = z[i++];
		}
		for (int x = 0; x < num; x++) 
			z[low + x] = temp[x];
		
	}
		//The main method
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int element, i;
			//Holds the number of elements
			System.out.println("Enter number of integer elements: ");
			element = sc.nextInt();
			//Array for the elements
			int arr[] = new int [element];
			//Holds the elements
			System.out.println("\nEnter " + element + " integer elements");
			for (i = 0; i < element; i++) 
				arr[i] = sc.nextInt();
			//Calls the sort method
			sort(arr , 0 , element);
			//Print sorted elements
			System.out.println("\nElements after sorting: ");
			for (i = 0; i < element; i++)
				System.out.print(arr[i] + " ");
				System.out.println();
			
		}

}