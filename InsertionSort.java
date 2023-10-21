
import java.util.Scanner;
/*
 * writen by: Lahu Shahadev Andhale
 * date: 21-10-2023
 */
public class InsertionSort {
    static void InsertionSortImplementation(int arr[]){
        for(int i=1;i<arr.length;i++){
            int k=arr[i];
            int j=i-1;
            while(j>=0 && k<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=k;
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
        InsertionSortImplementation(arr);
        System.out.println("After applying the Insertion sort the data set is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*
 * Sample Input output:
 * Enter Size of data set: 5 
 * Enter the elements of the data set:
 * 9 3 5 2 7
 * After applying the Insertion sort the data set is:
 * 2 3 5 7 9
 */
/*
 * Complexity Analysis:
 * The complexity of InsertionSortImplementation() is O(N^2);
 * So the time Complexity of the above program is O(N^2);
 */

