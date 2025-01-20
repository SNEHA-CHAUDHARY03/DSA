package theory_class;

import java.util.Scanner;

public class Array_initialization {
    public static void main(String[] args) {
        System.out.println("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();


        int[]  arr = new int[size];
        for(int i =0;i<size;i++){
            System.out.println("Enter the element of " + i +"th element");
            int k = sc.nextInt();
            arr[i] = k;
        }

        for(int i = 0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
