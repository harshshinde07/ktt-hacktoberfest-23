import java.util.Scanner;

/*
 * writen by: Lahu Shahadev Andhale
 * date: 4-09-2023
 */
public class BubbleSort {

    static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of data set: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the data set: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        System.out.println("After applying the Bubble sort the data set is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*
 * Sample INput Output
 * Enter Size of data set: 5
 * Enter the elements of the data set:
 * 5 2 6 1 8
 * After applying the Bubble sort the data set is:
 * 1 2 5 6 8
 */
/*
 * Complexity analysis:
 * the BubbleSort() function having O(N^2);
 * So the Overall time complexity is O(N^2)
 * Where N is size of Input.
 */