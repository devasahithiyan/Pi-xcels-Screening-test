
import java.util.Scanner;


public class Main {
    public static int minDist(int[] arr, int n, int x, int y) {
        int lastX = -1, lastY = -1, minDist = Integer.MAX_VALUE;
        boolean foundX = false, foundY = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                lastX = i;
                foundX = true;
                if (lastY != -1) {
                    minDist = Math.min(minDist, lastX - lastY);
                }
            }
            if (arr[i] == y) {
                lastY = i;
                foundY = true;
                if (lastX != -1) {
                    minDist = Math.min(minDist, lastY - lastX);
                }
            }
        }

        if (!foundX || !foundY) return -1;
        return minDist;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[]= new int[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Enter the element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the first number: ");
        int x = sc.nextInt();
        System.out.println("Enter the second number: ");
        int y = sc.nextInt();


        System.out.println("Minimum distance between " +x+ " and 1" + y + " is"+minDist(arr, n, x, y));
    }
}

