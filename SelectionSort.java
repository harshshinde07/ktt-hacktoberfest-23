
import java.util.*;
public class SelectionSort {
    static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minEleIdx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minEleIdx]){
                    minEleIdx=j;
                }
            }
            int temp=arr[minEleIdx];
            arr[minEleIdx]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of data set: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the data set: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        System.out.println("After applying the Selection sort the data set is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*
 * Sample Input Output Analysis:
 * Enter Size of data set: 5
 * Enter the elements of the data set: 
 * 2 6 10 2 7
 * After applying the Selection sort the data set is:
 * 2 2 6 7 10
 */
/*
 * Complexity Analysis:
 * The complexity of selectionSort() is O(N^2);
 * So the time Complexity of the above program is O(N^2);
 */
